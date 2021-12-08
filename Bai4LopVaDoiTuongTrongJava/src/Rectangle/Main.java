package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scaner.nextDouble();
        System.out.println("Enter the height");
        double height = scaner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("You Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
