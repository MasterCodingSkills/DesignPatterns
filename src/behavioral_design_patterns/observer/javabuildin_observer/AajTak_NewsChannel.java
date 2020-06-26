package behavioral_design_patterns.observer.javabuildin_observer;

import java.util.Observable;
import java.util.Observer;

public class AajTak_NewsChannel implements Observer {
    private Observable observable;

    public AajTak_NewsChannel(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Yor are watching AajTak news and breaking news is \n"+arg);
    }
}
