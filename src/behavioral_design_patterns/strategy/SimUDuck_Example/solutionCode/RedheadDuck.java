package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        setFlyBehavior(DefaultFlyBehaviors.redHeadDuck);
        setQuackBehavior(DefaultQuackBehaviors.redHeadDuck);
    }

    @Override
    public void display() {
        System.out.println("I am a redHeadDuck");
    }
}
