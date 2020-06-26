package behavioral_design_patterns.observer.javabuildin_observer;

public class Test {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        ABP_NewsChannel abp_newsChannel = new ABP_NewsChannel(newsAgency);
        AajTak_NewsChannel aajTak_newsChannel = new AajTak_NewsChannel(newsAgency);
        Republic_NewsChannel republic_newsChannel = new Republic_NewsChannel(newsAgency);

        newsAgency.setNews("Swami Ramdev introduce corona virus medicine : coronil");

        newsAgency.setNews("Indian army won in ladakh.");

    }
}
