package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
