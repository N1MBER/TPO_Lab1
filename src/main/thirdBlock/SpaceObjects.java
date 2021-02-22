package main.thirdBlock;

public abstract class SpaceObjects implements SpaceFlight {
    private double x;
    private double y;
    private double z;
    private SpaceObjectType type;
    private double rotate = 0;

    SpaceObjects(SpaceObjectType type) {
        this.type = type;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    SpaceObjects(SpaceObjectType type, double x, double y, double z) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public double getRotate() {
        return rotate;
    }
}

