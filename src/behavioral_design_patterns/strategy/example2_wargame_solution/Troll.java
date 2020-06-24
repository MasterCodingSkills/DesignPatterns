package behavioral_design_patterns.strategy.example2_wargame_solution;

public class Troll extends Character{

    public Troll(String name) {
        weaponBehavior = DefaultWeapon.TROLL;
        this.name = name;
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
