package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anjana Shankar
 * @Created 2020-12-13
 */
public class ConcreteSubject1 implements Subject{

    List<Observer> observers;

    public ConcreteSubject1() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Status s) {
        for(Observer o : observers) {
            o.update(s);
        }
    }
}
