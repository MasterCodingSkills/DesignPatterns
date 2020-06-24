package behavioral_design_patterns.strategy.example1_duckgame_problem_solution.solutionCode;

public interface DefaultFlyBehaviors {
    FlyBehavior MALLARD_DUCK = new FlyWithWings();
    FlyBehavior RUBBER_DUCK = new FlyNoWay();
    FlyBehavior REDHEAD_DUCK = new FlyWithWings();
    FlyBehavior DECOY_DUCK = new FlyNoWay();
}
