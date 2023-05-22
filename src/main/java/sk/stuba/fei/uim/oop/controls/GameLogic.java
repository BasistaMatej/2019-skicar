package sk.stuba.fei.uim.oop.controls;

import lombok.Getter;
import sk.stuba.fei.uim.oop.actions.Actions;
import sk.stuba.fei.uim.oop.actions.Colors;
import sk.stuba.fei.uim.oop.shapes.Line;
import sk.stuba.fei.uim.oop.shapes.Plus;
import sk.stuba.fei.uim.oop.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GameLogic extends UniversalAdapter {
    public static final String BUTTON_PLUS_TEXT = "Plus";
    public static final String BUTTON_LINE_TEXT = "Úsečka";
    public static final String BUTTON_COLOR_TEXT = "Zmenit farbu";
    @Getter
    private JPanel drawingPanel;
    @Getter
    private JLabel infoLabel;
    @Getter
    private Choice colorChooser;

    private ArrayList<JPanel> shapes;
    private Actions currentAction;
    @Getter
    private JButton changeColorButton;

    public GameLogic() {
        this.changeColorButton = new JButton(BUTTON_COLOR_TEXT);
        this.changeColorButton.addMouseListener(this);
        this.changeColorButton.setFocusable(false);
        this.shapes = new ArrayList<>();
        this.currentAction = Actions.NONE;
        this.drawingPanel = new JPanel();
        this.colorChooser = new Choice();
        this.colorChooser.add(Colors.RED.getTranslateName());
        this.colorChooser.add(Colors.BLUE.getTranslateName());
        this.colorChooser.add(Colors.GREEN.getTranslateName());

        this.colorChooser.addItemListener(this);
        this.colorChooser.addMouseListener(this);
        this.infoLabel = new JLabel(colorChooser.getSelectedItem());
        this.drawingPanel.setLayout(null);
        this.drawingPanel.addMouseMotionListener(this);
        this.drawingPanel.addMouseListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof Choice) {
            this.infoLabel.setText(colorChooser.getSelectedItem());
            this.infoLabel.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton jButton = (JButton) e.getSource();
            JPanel shape;
            switch (jButton.getText()) {
                case BUTTON_PLUS_TEXT:
                    this.currentAction = Actions.PLUS;
                    shape = new Plus(Arrays.stream(Colors.values()).filter(color -> Objects.equals(color.getTranslateName(), colorChooser.getSelectedItem())).findFirst().get().getColor());
                    shapes.add(shape);
                    break;
                case BUTTON_LINE_TEXT:
                    this.currentAction = Actions.LINE;
                    shape = new Line(Arrays.stream(Colors.values()).filter(color -> Objects.equals(color.getTranslateName(), colorChooser.getSelectedItem())).findFirst().get().getColor());
                    shapes.add(shape);
                    break;
                case BUTTON_COLOR_TEXT:
                    this.currentAction = Actions.CHANGE_COLOR;
                    break;
            }
        } else {
            switch (this.currentAction) {
                case PLUS:
                case LINE:
                    moveShapeOnBoard(e);
                    this.currentAction = Actions.NONE;
                    break;
                case CHANGE_COLOR:
                    if((e.getSource() instanceof  JPanel))  {
                        for (JPanel shape : this.shapes) {
                            if( e.getX() >= shape.getX() && (e.getX()  <= shape.getX()+shape.getWidth()) &&
                                    e.getY() >= shape.getY() && (e.getY() <= shape.getY()+shape.getHeight())) {
                                Shape activeShape = (Shape) shape;
                                activeShape.setColor(Arrays.stream(Colors.values()).filter(color -> Objects.equals(color.getTranslateName(), colorChooser.getSelectedItem())).findFirst().get().getColor());
                                this.drawingPanel.repaint();
                                return;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(e.getSource() instanceof JPanel && (this.currentAction == Actions.PLUS || this.currentAction == Actions.LINE) && !shapes.isEmpty()) {
            moveShapeOnBoard(e);
        }
    }

    private void moveShapeOnBoard(MouseEvent e) {
        JPanel activeShape = shapes.get(shapes.size() - 1);
        this.drawingPanel.remove(activeShape);
        shapeToSpecificPossition(activeShape,e);
    }

    private void shapeToSpecificPossition(JPanel shape, MouseEvent e) {
        shape.setBounds(e.getX()-50,e.getY()-50,150,150);
        this.drawingPanel.add(shape);
        this.drawingPanel.repaint();
    }
}
