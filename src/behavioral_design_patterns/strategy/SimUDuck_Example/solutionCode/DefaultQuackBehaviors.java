package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public interface DefaultQuackBehaviors {
    public static final QuackBehavior mallardDuck = new Quack();
    public static final QuackBehavior rubberDuck = new Squeak();
    public static final QuackBehavior redHeadDuck = new Quack();
    public static final QuackBehavior decoyDuck = new MuteQuack();
}
