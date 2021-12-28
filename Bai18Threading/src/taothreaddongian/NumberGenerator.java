package taothreaddongian;

public class NumberGenerator implements Runnable{

    public NumberGenerator() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(hashCode());
            sleep(500);
        }
    }

    private static void sleep(int i) {
    }
}
