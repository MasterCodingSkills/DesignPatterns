package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(DefaultFlyBehaviors.rubberDuck);
        setQuackBehavior(DefaultQuackBehaviors.rubberDuck);
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
