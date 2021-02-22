package main.thirdBlock;

import java.util.ArrayList;
import java.util.Iterator;

public class SpaceShip extends SpaceObjects{
    ArrayList<Engine> engines;
    SpaceShip(ArrayList<Engine> engines){
        super(SpaceObjectType.SPACE_SHIP);
        this.engines = engines;
    }

    public void flyByEngine(){
        Iterator<Engine> iterator = engines.iterator();
        double[] x_arr = new double[engines.size()];
        double[] y_arr = new double[engines.size()];
        double[] z_arr = new double[engines.size()];
        int i = 0;
        while (iterator.hasNext()){
            if (i == 0){
                iterator.next().randomPush(this);
                x_arr[i] = this.getX();
                y_arr[i] = this.getY();
                z_arr[i] = this.getZ();
            } else {
                iterator.next().randomPush(this);
                if (
                        x_arr[i-1] != this.getX() ||
                        y_arr[i-1] != this.getY() ||
                        z_arr[i-1] != this.getZ()
                ){
                    System.out.println("Корабль начинает трясти");
                }
            }
            i++;
        }

    }


    @Override
    public void flyTo(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public void rotate(double degrees) {
        if (degrees == 180)
            System.out.println("Корабль развернулся кругом");
        setRotate(getRotate() + degrees);
    }

    public void makeArc(){
        this.flyTo(getX() + 200, getY(), getZ() + 100);
        setRotate(120);
        System.out.println("Корабль описал крутую дугу");
    }
}
