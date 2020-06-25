package behavioral_design_patterns.observer.weatherstation;

public class ForecastDisplay implements Observer,DisplayElement{
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: "+ temperature
                +"F degrees and "+humidity+"%"
                +" and pressure is "+pressure);
    }

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
