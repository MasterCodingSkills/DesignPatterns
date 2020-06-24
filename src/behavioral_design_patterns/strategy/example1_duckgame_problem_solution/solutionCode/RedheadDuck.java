package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        setFlyBehavior(DefaultFlyBehaviors.REDHEAD_DUCK);
        setQuackBehavior(DefaultQuackBehaviors.REDHEAD_DUCK);
    }

    @Override
    public void display() {
        System.out.println("I am a redHeadDuck");
    }
}
