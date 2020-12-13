package observer;

/**
 * @Author Anjana Shankar
 * @Created 2020-12-13
 */
public class Main {
    public static void main(String[] args) {
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        ConcreteSubject1 subject1 = new ConcreteSubject1();
        subject1.register(observer1);
        subject1.register(observer2);

        subject1.setMessage("Status change 1");

        subject1.unregister(observer1);
        subject1.setMessage("Status change 2");
    }
}
