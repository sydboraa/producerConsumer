import utils.SizedStack;

/**
 * Created by sb on 06.01.2016.
 */
public class Consumer implements Runnable {

    private final SizedStack<Integer> mySizedStack;

    public Consumer(SizedStack<Integer> mySizedStack) {
        this.mySizedStack = mySizedStack;
    }

    public void run() {
        while(true) {
            try {
                int element = getAnElementFromQueue();
                System.out.println("Consumer got the element: " + element);

            } catch (InterruptedException ex) {
                System.out.println("There is a problem with consumer. " + ex.getMessage());
            }
        }
    }

    public int getAnElementFromQueue() throws InterruptedException {
        while(mySizedStack.isEmpty()) {
            synchronized (mySizedStack) {
                System.out.println("Queue is empty. Consumer is waiting...");
                mySizedStack.wait();
            }
        }
        synchronized (mySizedStack) {
            mySizedStack.notifyAll();
            return mySizedStack.pop();
        }
    }


}
