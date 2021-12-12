package baitap.loppoint2d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1,2);
        System.out.println(point2D);

        point2D.setXY(4,6);
        System.out.println(point2D);

        point2D.setX(2);
        System.out.println(point2D);

    }


}
