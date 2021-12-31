package baitap.apdungfactorymethod;

public class ShapeFactory {


    public Shape getShape(String type){
        if("Circle".equals(type)){
            return new Circle();
        }else if("Square".equals(type)){
            return new Square();
        }else {
            return new Rectangle();
        }
    }
}
