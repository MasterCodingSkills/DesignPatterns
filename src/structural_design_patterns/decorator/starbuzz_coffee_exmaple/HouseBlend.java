package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.12;
    }
}
