package behavioral_design_patterns.strategy.SimUDuck_Example.problemCode;

public abstract class Duck {

    public abstract void display();
    public void quack() {
        System.out.println("Quack Quack....");
    }
    public void swim() {
        System.out.println("Swimming...");
    }
}
