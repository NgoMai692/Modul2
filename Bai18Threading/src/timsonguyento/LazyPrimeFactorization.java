package timsonguyento;

public class LazyPrimeFactorization implements Runnable {


    @Override
    public void run() {
        System.out.println(2);
        for (int i = 3; i < 100 ; i++) {
            boolean check = true;
            for (int j = 2; j < i ; j++) {
                if (i % j ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(i);
            }
            i++;
        }
    }
}
