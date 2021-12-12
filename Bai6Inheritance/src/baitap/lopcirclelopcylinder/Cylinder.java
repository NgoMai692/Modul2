package baitap.lopcirclelopcylinder;

public class Cylinder extends Circle{
    double height = 1.2;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder( double height,double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height " + height +
                 " , which is a subclass of " + super.toString();
    }
}
