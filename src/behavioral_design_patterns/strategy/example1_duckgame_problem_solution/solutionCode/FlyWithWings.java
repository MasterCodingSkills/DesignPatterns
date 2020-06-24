package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I have wings to fly");
    }
}
