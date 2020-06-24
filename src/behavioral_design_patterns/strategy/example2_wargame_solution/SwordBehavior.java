package behavioral_design_patterns.strategy.example2_wargame_solution;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Sword As Weapon");
    }
}
