package taothreaddongian;

public class Main {
    public static void main(String[] args) {

        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator1);
        int maxPriority = Thread.MAX_PRIORITY;
        int minPriority = Thread.MIN_PRIORITY;
        thread1.setPriority(maxPriority);
        thread2.setPriority(minPriority);
        thread1.start();
        thread2.start();


    }
}
