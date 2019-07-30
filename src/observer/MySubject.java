package observer;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList observers = new ArrayList();

    public void attach(MyObserver observer){
        observers.add(observer);
    }

    public void detach(MyObserver observer){
        observers.add(observer);
    }

    public abstract void price();
}
