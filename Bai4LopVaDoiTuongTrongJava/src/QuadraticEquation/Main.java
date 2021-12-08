package QuadraticEquation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap he so c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()< 0){
            System.out.println("The equation has no roots");
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has once root:" + -b/(2*a));
        }else {
            System.out.println("The equation has two roots: ");
            System.out.println("Root1: "+ quadraticEquation.getRoot1());
            System.out.println("Root2: "+ quadraticEquation.getRoot2());

        }
    }
}
