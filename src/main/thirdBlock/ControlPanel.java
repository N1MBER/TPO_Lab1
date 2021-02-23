package main.thirdBlock;

import java.util.ArrayList;

public class ControlPanel {
    private String nameDevice = "Пульт";
    private ArrayList<ControlElements> elements;
    ControlPanel(ArrayList<ControlElements> elements) {
        this.elements = elements;
    }
}
