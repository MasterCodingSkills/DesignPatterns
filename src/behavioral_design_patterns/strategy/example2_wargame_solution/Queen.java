package behavioral_design_patterns.strategy.example2_wargame_solution;

public class Queen extends Character{

    public Queen(String name) {
        weaponBehavior = DefaultWeapon.QUEEN;
        this.name = name;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
