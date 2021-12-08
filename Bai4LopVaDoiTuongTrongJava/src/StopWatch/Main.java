package StopWatch;

public class Main {
    public static void main(String[] args) {
        long [] arr = new long[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random()*10000);
        }

        StopWatch startTime = new StopWatch();
        startTime.start();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    long temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        StopWatch endTime = new StopWatch();
        endTime.stop();

        System.out.println(endTime.getEndTime() - startTime.getStartTime());
    }

}
