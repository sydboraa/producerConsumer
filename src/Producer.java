import utils.SizedStack;

/**
 * Created by sb on 06.01.2016.
 */
public class Producer implements Runnable {

    private final SizedStack<Integer> mySizedStack;

    public Producer(SizedStack<Integer> mySizedStack) {
        this.mySizedStack = mySizedStack;
    }

    public void run() {
        try {
            for(int i = 0; i < 15; i++) {
                insertAnElement(i);
            }
        } catch (InterruptedException ex) {

        }

    }

    //this method produces something (insert an element to queue
    public void insertAnElement(int number) throws InterruptedException {
        while(mySizedStack.size() == 5) { //my stack size was 10
            synchronized (mySizedStack) {
                System.out.println("Queue is full. Producer is waiting...");
                mySizedStack.wait();
            }
        }

        synchronized (mySizedStack) {
            mySizedStack.push(number);
            mySizedStack.notifyAll(); //to inform the consumers, there is a new element in the queue
            System.out.println("Producer thread inserted number: " + number + " to queue.");
        }

    }
}
