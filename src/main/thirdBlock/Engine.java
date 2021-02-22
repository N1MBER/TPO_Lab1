package main.thirdBlock;

import java.util.ArrayList;

public class Engine implements EnginePush{
    public void randomPush(SpaceShip ship){
        System.out.println("Толкаю корабль во всех направлениях");
        double x = (double)( Math.random() * 1000000);
        double y = (double)( Math.random() * 1000000);
        double z = (double)( Math.random() * 1000000);
        pushToSomething(ship,x,y,z);

    }
    @Override
    public void pushToSomething(SpaceObjects objects, double x, double y, double z) {
        objects.setX(x);
        objects.setY(y);
        objects.setZ(z);
    }
}
