/**
 * @author kevinswan102
 */
public class MultithreadingSub extends Thread {
    private final int threadNumber;

    //Constructor to specify the number of threads we want in the main class
    public MultithreadingSub(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    //Overriding default run method to complete 5 iterations
    @Override
    public void run() {
        try {
            Thread.sleep(4000); //Each Thread.sleep() must be surrounded by try{} catch(){}
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1500); //Thread sleeps for 1.5 seconds between each number printed
            } catch (InterruptedException e) {
            }
        }
    }
}
