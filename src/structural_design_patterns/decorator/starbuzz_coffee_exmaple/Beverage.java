package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
