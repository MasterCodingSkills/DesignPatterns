package behavioral_design_patterns.strategy.SimUDuck_Example;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking.......");
    }
}
