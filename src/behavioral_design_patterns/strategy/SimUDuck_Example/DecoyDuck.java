package behavioral_design_patterns.strategy.SimUDuck_Example;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am a decoy duck");
    }
}
