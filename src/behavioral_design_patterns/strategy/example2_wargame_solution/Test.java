package behavioral_design_patterns.strategy.example2_wargame_solution;

public class Test {
    public static void main(String[] args) {
        Character king = new King("Manish");
        king.fight();

        Character queen = new Queen("Soni");
        queen.fight();

        Character troll = new Troll("Prdeep");
        troll.fight();

        Character knight = new Knight("Rahul");
        knight.fight();

        king.setWeaponBehavior(new BowAndArrowWeaponBehavior());
        king.fight();
    }
}
