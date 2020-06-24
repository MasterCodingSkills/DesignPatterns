package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.problemCode;

public abstract class Duck {

    public abstract void display();
    public void quack() {
        System.out.println("Quack Quack....");
    }
    public void swim() {
        System.out.println("Swimming...");
    }
}
