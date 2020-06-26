package behavioral_design_patterns.observer.javabuildin_observer;

import java.util.Observable;
import java.util.Observer;

public class ABP_NewsChannel implements Observer {
    private Observable observable;

    public ABP_NewsChannel(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Yor are watching ABP news and breaking news is \n"+arg);
    }
}
