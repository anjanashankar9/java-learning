package observer;

/**
 * @Author Anjana Shankar
 * @Created 2020-12-13
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void update(Status message) {
        System.out.println("Observer 2 received message - "+message.getMessage());
    }
}
