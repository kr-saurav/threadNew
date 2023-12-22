package thread_lec_324.dev.lpa;
public class first extends Thread {

    @Override
    public void run() {

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("i-> " + i);
            try {
                Thread.sleep(500);  // Adding a 1-second delay between each count
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
