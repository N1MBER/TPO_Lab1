package main.thirdBlock;

import java.util.ArrayList;
import java.util.Iterator;

public class Human extends Being implements HumanAction{
    private  ArrayList holdObjects = new ArrayList<ControlElements>();
    private Object nearObject;
    public Human(String name){
        super(name);
    }

    public void setNearObject(Object nearObject) {
        this.nearObject = nearObject;
    }

    public Object getNearObject() {
        return nearObject;
    }

    @Override
    public void jumpedUp( ControlPanel panel) {
        System.out.println(this.getName() + " подскочил к пультам");
        this.setNearObject(panel);
    }

    public ArrayList getHoldObjects() {
        return holdObjects;
    }

    @Override
    public void grab(ControlElements element) {
        Boolean flag = false;
        ArrayList<ControlElements> deleteObjects = new ArrayList<>();
        Iterator<ControlElements> iterator = holdObjects.iterator();
        while (iterator.hasNext()){
            ControlElements controlElement = iterator.next();
            if (element.compareTo(controlElement) == 0){
                flag = true;
                System.out.println(this.getName() + " отпустил " + controlElement.getNameElement());
                deleteObjects.add(controlElement);
            }
        }
        Iterator<ControlElements> delete = deleteObjects.iterator();
        while (delete.hasNext()){
            this.holdObjects.remove(delete.next());
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
