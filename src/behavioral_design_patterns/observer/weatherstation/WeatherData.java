package behavioral_design_patterns.observer.weatherstation;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
        observers  = new ArrayList<>();
        temperature = 0.0;
        humidity = 0.0;
        pressure = 0.0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > 0) {
            observers.remove(index);
        }
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(Double temperature,Double humidity,Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
