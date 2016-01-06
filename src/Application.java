import utils.SizedStack;

/**
 * Created by sb on 06.01.2016.
 */
public class Application {

    public static void main(String args[]) {
        SizedStack<Integer> mySizedStack = new SizedStack<Integer>(5);
        Thread threadProducer = new Thread(new Producer(mySizedStack));
        Thread threadConsumer = new Thread(new Consumer(mySizedStack));
        threadProducer.start();
        threadConsumer.start();

    }

}
