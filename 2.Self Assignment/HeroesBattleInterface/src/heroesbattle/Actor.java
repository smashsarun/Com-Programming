package heroesbattle;

public class Actor extends BeAlive implements CanAttack, CanBeAttacked {

    private Weapon weapon;
    private Armor armor;

    public Actor(String name, int health, Armor armor, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public int getAttackPower() {
        return weapon.getPower(); //พลังที่โจมตีมา
    }

    @Override
    public void beAttacked(CanAttack obj) {
        int beAttack = obj.getAttackPower()-armor.useArmor();
        changeHealth(beAttack);
    }

}
