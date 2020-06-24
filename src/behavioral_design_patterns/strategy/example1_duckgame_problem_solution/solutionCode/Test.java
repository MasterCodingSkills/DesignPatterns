package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

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
