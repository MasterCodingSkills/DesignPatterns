package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.problemCode;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("I don't quack..i just squeak.");
    }
}
