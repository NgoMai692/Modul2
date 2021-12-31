package baitap.apdungfactorymethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("Square");
        System.out.println(s1.draw());

        Shape s2 = shapeFactory.getShape("Circle");
        System.out.println(s2.draw());

        Shape s3 = shapeFactory.getShape("add");
        System.out.println(s3.draw());
    }
}
