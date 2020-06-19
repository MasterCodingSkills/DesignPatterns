package behavioral_design_patterns.strategy.SimUDuck_Example;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
