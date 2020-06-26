package behavioral_design_patterns.observer.javabuildin_observer;

import java.util.Observable;

public class NewsAgency extends Observable {
    private String news;

    public void newsChanged() {
        setChanged();
        notifyObservers(news);
    }

    public void setNews(String news) {
        this.news = news;
        newsChanged();
    }
}
