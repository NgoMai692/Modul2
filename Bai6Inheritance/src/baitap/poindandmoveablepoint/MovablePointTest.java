package baitap.poindandmoveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2.1f,5.2f);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(1,2,3.2f,4.7f);
        System.out.println(movablePoint);
    }



}
