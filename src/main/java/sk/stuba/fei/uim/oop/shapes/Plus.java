package sk.stuba.fei.uim.oop.shapes;

import javax.swing.*;
import java.awt.*;

public class Plus extends Shape {
    public Plus(Color color) {
        this.color = color;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(this.getWidth()/3,0,this.getWidth()/3,this.getHeight());
        g.fillRect(0,this.getHeight()/3,this.getWidth(),this.getHeight()/3);
    }
}
