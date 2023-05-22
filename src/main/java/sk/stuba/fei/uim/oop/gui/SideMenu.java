package sk.stuba.fei.uim.oop.gui;

import sk.stuba.fei.uim.oop.controls.GameLogic;

import javax.swing.*;
import java.awt.*;

public class SideMenu extends JPanel {
    private JButton buttonPlus;
    private JButton buttonLine;

    public SideMenu(GameLogic logic) {
        this.setLayout(new GridLayout(1,4));
        this.buttonPlus = createButton(GameLogic.BUTTON_PLUS_TEXT,logic);
        this.buttonLine = createButton(GameLogic.BUTTON_LINE_TEXT,logic);

        this.add(this.buttonPlus);
        this.add(this.buttonLine);
        this.add(logic.getColorChooser());
        this.add(logic.getInfoLabel());

    }

    private JButton createButton(String name, GameLogic logic) {
        JButton button = new JButton(name);
        button.addActionListener(logic);
        button.addMouseListener(logic);
        button.setFocusable(false);
        return button;
    }
}
