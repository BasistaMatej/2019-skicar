package sk.stuba.fei.uim.oop.gui;

import sk.stuba.fei.uim.oop.controls.GameLogic;

import javax.swing.*;
import java.awt.*;

public class Skicar {
    private static final int FRAME_SIZE = 700;

    public Skicar() {
        JFrame frame = new JFrame("Skicar 2019");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_SIZE, FRAME_SIZE);
        frame.setLayout(new BorderLayout());

        GameLogic logic = new GameLogic();
        frame.add(new SideMenu(logic), BorderLayout.PAGE_START);
        frame.add(logic.getDrawingPanel(), BorderLayout.CENTER);
        frame.add(logic.getChangeColorButton(), BorderLayout.PAGE_END);

        frame.setFocusable(true);
        frame.setVisible(true);
    }
}
