package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(DefaultFlyBehaviors.MALLARD_DUCK);
        setQuackBehavior(DefaultQuackBehaviors.MALLARD_DUCK);
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
