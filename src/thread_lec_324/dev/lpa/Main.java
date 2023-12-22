package thread_lec_324.dev.lpa;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        first customThread = new first();
        customThread.start();

        Runnable myRunnable = () -> {

            for(int i = 1 ; i <= 10 ; i = i + 2){
                System.out.println("odd i => " + i);
                try{
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}

