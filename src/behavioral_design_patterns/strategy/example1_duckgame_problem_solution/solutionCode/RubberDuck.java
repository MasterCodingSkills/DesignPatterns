package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(DefaultFlyBehaviors.RUBBER_DUCK);
        setQuackBehavior(DefaultQuackBehaviors.RUBBER_DUCK);
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
