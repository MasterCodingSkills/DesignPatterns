package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(DefaultFlyBehaviors.mallardDuck);
        setQuackBehavior(DefaultQuackBehaviors.mallardDuck);
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
