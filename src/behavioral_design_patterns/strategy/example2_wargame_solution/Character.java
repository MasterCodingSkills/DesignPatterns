package behavioral_design_patterns.strategy.example2_wargame_solution;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    protected String name;

    public abstract void fight();
    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
