package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.problemCode;

public class WoodDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a wooden duck");
    }

    @Override
    public void quack() {
        System.out.println("I don't quack.");
    }
}
