import java.util.*;

/**
 * Created by sb on 06.01.2016.
 */
public class Application {

    public static void main(String args[]) {
        Queue<Integer> myQueue = new ArrayDeque<>(10);
        Thread threadProducer = new Thread(new Producer(myQueue));
        Thread threadConsumer = new Thread(new Consumer(myQueue));
        threadProducer.start();
        threadConsumer.start();

    }

}
