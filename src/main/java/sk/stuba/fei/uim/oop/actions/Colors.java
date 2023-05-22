package sk.stuba.fei.uim.oop.actions;

import lombok.Getter;

import java.awt.*;

public enum Colors {
    GREEN(Color.GREEN, "Zelena"),
    BLUE(Color.BLUE, "Modra"),
    RED(Color.RED, "Červena");

    @Getter
    private String translateName;
    @Getter
    private Color color;

    Colors(Color color, String translateName) {
        this.translateName = translateName;
        this.color = color;
    }
}