package behavioral_design_patterns.strategy.SimUDuck_Example;

public abstract  class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("Swimming");
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
