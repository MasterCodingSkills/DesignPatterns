package behavioral_design_patterns.strategy.example2_wargame_solution;

public class BowAndArrowWeaponBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using BowAndArrow As Weapon");
    }
}
