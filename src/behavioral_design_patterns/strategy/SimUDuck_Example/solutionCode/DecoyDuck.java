package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(DefaultFlyBehaviors.decoyDuck);
        setQuackBehavior(DefaultQuackBehaviors.decoyDuck);
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck");
    }
}
