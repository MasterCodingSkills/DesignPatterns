package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
