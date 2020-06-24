package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking.......");
    }
}
