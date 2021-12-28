package ungdungdemso;

public class Count implements Runnable{
    private Thread myThread;

    public Count(){
        myThread = new Thread(this,"my runnablr thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Print the count "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("my thread run is over");
        }
    }
    public Thread getMyThread(){
        return myThread;
    }
}
