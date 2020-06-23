package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public interface DefaultFlyBehaviors {
    public static final FlyBehavior mallardDuck = new FlyWithWings();
    public static final FlyBehavior rubberDuck = new FlyNoWay();
    public static final FlyBehavior redHeadDuck = new FlyWithWings();
    public static final FlyBehavior decoyDuck = new FlyNoWay();
}
