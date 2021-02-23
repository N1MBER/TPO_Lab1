package main.thirdBlock;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Human Ford = new Human("Форд");
        ControlElements element1 = new ControlElements("Рукоятка №1",1);
        ControlElements element2 = new ControlElements("Рукоятка №2",2);
        ArrayList<ControlElements> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        ControlPanel panel = new ControlPanel(elements);
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        ArrayList<Engine> engines = new ArrayList<>();
        engines.add(engine1);
        engines.add(engine2);
        SpaceShip spaceShip = new SpaceShip(engines);
        Rocket rocket = new Rocket(21532.34242, 23424.1231, -123123.54);
        Ford.jumpedUp(panel);
        Ford.guess();
        Ford.grab(element1);
        Ford.grab(element2);
        spaceShip.flyByEngine();
        Ford.grab(element2);
        spaceShip.makeArc();
        spaceShip.rotate(180);
        spaceShip.flyTo(rocket.getX(), rocket.getY(), rocket.getZ());
        if (
                spaceShip.getX() == rocket.getX() &&
                spaceShip.getY() == rocket.getY() &&
                spaceShip.getZ() == rocket.getZ()
        )
            System.out.println("Корабль направился к ракетам");
    }
}
