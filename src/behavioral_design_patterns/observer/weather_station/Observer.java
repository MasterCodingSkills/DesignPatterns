package behavioral_design_patterns.observer.weather_station;

public interface Observer {
    void update(Double temp,Double humidity,Double pressure);
}
