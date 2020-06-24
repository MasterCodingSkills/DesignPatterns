package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public interface DefaultQuackBehaviors {
    QuackBehavior MALLARD_DUCK = new Quack();
    QuackBehavior RUBBER_DUCK = new Squeak();
    QuackBehavior REDHEAD_DUCK = new Quack();
    QuackBehavior DECOY_DUCK = new MuteQuack();
}
