package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class RocketPowerFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying with Rocket Power");
    }
}