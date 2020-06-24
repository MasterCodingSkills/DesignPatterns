package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(DefaultFlyBehaviors.DECOY_DUCK);
        setQuackBehavior(DefaultQuackBehaviors.DECOY_DUCK);
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck");
    }
}
