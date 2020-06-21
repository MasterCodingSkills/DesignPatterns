package behavioral_design_patterns.strategy.SimUDuck_Example.problemCode;

public class WoodDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a wooden duck");
    }

    @Override
    public void quack() {
        System.out.println("I don't quack.");
    }
}
