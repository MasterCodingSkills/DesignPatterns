package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.20;
    }
}
