package behavioral_design_patterns.strategy.SimUDuck_Example.solutionCode;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(new RocketPowerFly());
        mallardDuck.performFly();
    }
}
