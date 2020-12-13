package observer;

/**
 * @Author Anjana Shankar
 * @Created 2020-12-13
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer 1 received message - "+message);
    }
}
