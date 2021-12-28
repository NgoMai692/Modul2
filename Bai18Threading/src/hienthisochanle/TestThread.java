package hienthisochanle;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Runnable target;
        Thread thread1 = new Thread(oddThread);
        evenThread.start();
        thread1.start();

    }

}
