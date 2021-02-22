package main.thirdBlock;

public class Rocket extends SpaceObjects{
    Rocket(){
        super(SpaceObjectType.ROCKET);
    }

    Rocket(double x, double y ,double z){
        super(SpaceObjectType.ROCKET,x,y,z);
    }

    @Override
    public void flyTo(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public void rotate(double degrees) {
        setRotate(getRotate() + degrees);
    }
}
