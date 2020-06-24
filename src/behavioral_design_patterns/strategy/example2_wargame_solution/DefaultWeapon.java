package behavioral_design_patterns.strategy.example2_wargame_solution;

public interface DefaultWeapon {
    WeaponBehavior QUEEN = new BowAndArrowWeaponBehavior();
    WeaponBehavior KING = new SwordBehavior();
    WeaponBehavior TROLL = new KnifeBehavior();
    WeaponBehavior KNIGHT = new AxeBehavior();
}
