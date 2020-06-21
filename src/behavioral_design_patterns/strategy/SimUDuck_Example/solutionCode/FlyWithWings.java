package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I have wings to fly");
    }
}
