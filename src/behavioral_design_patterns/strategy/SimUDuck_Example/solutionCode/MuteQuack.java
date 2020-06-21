package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}