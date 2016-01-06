import java.util.Queue;

/**
 * Created by sb on 06.01.2016.
 */
public class Consumer implements Runnable {

    private final Queue<Integer> myQueue;

    public Consumer(Queue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        //Not implemented yet
    }


}
