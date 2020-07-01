package structural_design_patterns.decorator.starbuzz_coffee_exmaple;

public class Test {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+" $"+espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription()+" $"+darkRoast.cost());

    }
}
