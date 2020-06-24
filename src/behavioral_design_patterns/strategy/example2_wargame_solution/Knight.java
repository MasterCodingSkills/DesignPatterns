package behavioral_design_patterns.strategy.example2_wargame_solution;

public class Knight extends Character{

    public Knight(String name) {
        weaponBehavior = DefaultWeapon.KNIGHT;
        this.name = name;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
