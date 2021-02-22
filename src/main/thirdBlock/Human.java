package main.thirdBlock;

import java.util.ArrayList;
import java.util.Iterator;

public class Human extends Being implements HumanAction{
    private  ArrayList holdObjects = new ArrayList<ControlElements>();
    public Human(String name){
        super(name);
    }


    @Override
    public void jumpedUp( ControlPanel panel) {
        System.out.println(this.getName() + " подскочил к пультам");
    }

    public ArrayList getHoldObjects() {
        return holdObjects;
    }

    @Override
    public void grab(ControlElements element) {
        Boolean flag = false;
        Iterator<ControlElements> iterator = holdObjects.iterator();
        while (iterator.hasNext()){
            ControlElements controlElement = iterator.next();
            if (element.compareTo(controlElement) == 0){
                flag = true;
                System.out.println(this.getName() + " отпустил " + controlElement.getNameElement());
                holdObjects.remove(controlElement);
            }
        }
        if (!flag){
            holdObjects.add(element);
            System.out.println(this.getName() + " схватился за " + element.getNameElement());
        }
    }

    @Override
    public void guess() {
        System.out.println(this.getName() + " смог догадаться");
    }
}
