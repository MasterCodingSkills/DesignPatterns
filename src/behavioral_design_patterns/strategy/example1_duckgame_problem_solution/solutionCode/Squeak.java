package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak squeak......");
    }
}
