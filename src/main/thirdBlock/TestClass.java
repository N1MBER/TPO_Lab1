package main.thirdBlock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {
    SpaceShip spaceShip;
    Rocket rocket;
    Human person;
    Engine engine1 = new Engine();
    Engine engine2 = new Engine();
    ControlPanel panel;
    ControlElements controlElements1 = new ControlElements("Рукоятка №1", 1);
    ControlElements controlElements2 = new ControlElements("Рукоятка №2", 2);
    ArrayList<ControlElements> elements = new ArrayList<>();
    ArrayList<Engine> list = new ArrayList<>();

    @Before
    public void initData() {
        list.add(engine1);
        list.add(engine2);
        elements.add(controlElements1);
        elements.add(controlElements2);
        this.spaceShip = new SpaceShip(list);
        this.rocket = new Rocket(123.2312,-234234.123, 111111.4234234);
        this.person = new Human("TestUser");
        this.panel = new ControlPanel(elements);
    }

    @Test
    public void testNearObject(){
        this.person.jumpedUp(panel);
        Assert.assertTrue("Рядом пульт?",this.panel == this.person.getNearObject());
    }

    @Test
    public void testGrab(){
        this.person.grab(controlElements1);
        this.person.grab(controlElements2);
        Assert.assertTrue(this.person.getHoldObjects().size() == 2);
        this.person.grab(controlElements2);
        Iterator<ControlElements> iterator = this.person.getHoldObjects().iterator();
        while (iterator.hasNext()){
            Assert.assertTrue(controlElements1.equals(iterator.next()));
        }
    }

    @Test
    public void testMakeArc(){
        double x = this.spaceShip.getX();
        double y = this.spaceShip.getY();
        double z = this.spaceShip.getZ();
        double degrees = this.spaceShip.getRotate();
        this.spaceShip.makeArc();
        Assert.assertTrue(
                this.spaceShip.getX() == x + 200 &&
                        this.spaceShip.getY() == y &&
                        this.spaceShip.getZ() == z - 100 &&
                        this.spaceShip.getRotate() == degrees + 120
        );
    }

    @Test
    public void testRotate(){
        double degrees = this.spaceShip.getRotate();
        this.spaceShip.rotate(180);
        Assert.assertTrue(this.spaceShip.getRotate() == degrees + 180);
    }

    @Test
    public void testFlyTo(){
        this.spaceShip.flyTo(this.rocket.getX(), this.rocket.getY(), this.rocket.getZ());
        Assert.assertTrue(
                this.spaceShip.getX() == this.rocket.getX() &&
                this.spaceShip.getY() == this.rocket.getY() &&
                this.spaceShip.getZ() == this.rocket.getZ()
        );
    }


}
