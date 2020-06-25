package behavioral_design_patterns.observer.weatherstation;

public interface Observer {
    void update(Double temp,Double humidity,Double pressure);
}
