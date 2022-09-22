/**
 * @author kevinswan102
 */
public class Multithreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("THREAD INFORMATION:");
        // Loop is determining the number of concurrent threads
        for (int i = 0; i < 3; i++) {
            MultithreadingSub myThread = new MultithreadingSub(i); //All 3 myThreads will run simultaneously

            System.out.println("Thread " + i + " getName(): " + myThread.getName());
            System.out.println("Thread " + i + " getId(): " + myThread.getId());
            System.out.println("Thread " + i + " getState(): " + myThread.getState());
            System.out.println();

            myThread.start(); //Run myThread, start method creates concurrent threads
        }
        Thread.sleep(2000);
        System.out.println("\n" + "Running threads concurrently...");
    }
}
