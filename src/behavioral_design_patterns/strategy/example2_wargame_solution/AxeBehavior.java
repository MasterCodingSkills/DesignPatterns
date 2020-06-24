package behavioral_design_patterns.strategy.example2_wargame_solution;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Axe As Weapon");
    }
}
