package behavioral_design_patterns.observer.weatherstation;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private Double temprature;
    private Double humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+temprature
                +"F degrees and "+humidity+"%");
    }

    @Override
    public void update(Double temprature, Double humidity, Double pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }
}
