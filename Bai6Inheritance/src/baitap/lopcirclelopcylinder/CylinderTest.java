package baitap.lopcirclelopcylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.3);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5,2.5,"black");
        System.out.println(cylinder);
    }
}
