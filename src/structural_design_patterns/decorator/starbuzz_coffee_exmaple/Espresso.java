package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2.12;
    }
}
