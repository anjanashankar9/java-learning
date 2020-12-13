package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anjana Shankar
 * @Created 2020-12-13
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers(Status s);
}
