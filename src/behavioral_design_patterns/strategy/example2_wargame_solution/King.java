package behavioral_design_patterns.strategy.example2_wargame_solution;

public class King extends Character{

    public King(String name) {
        weaponBehavior = DefaultWeapon.KING;
        this.name = name;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
