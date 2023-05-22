package sk.stuba.fei.uim.oop.shapes;

import java.awt.*;

public class Line extends Shape {
    public Line(Color color) {
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(0, this.getHeight() / 3, this.getWidth(), this.getHeight() / 10);
    }
}
