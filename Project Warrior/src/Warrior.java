
public class Warrior extends Characters{

    private String weapon;
    private String shield;

    public Warrior(String name, int life, int atk) {
        super(name, life, atk);
    }

    public String getWeapon() {
        return weapon;
    }

    public String getShield() {
        return shield;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }
    public String toString() {
        return "Warrior: " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getAtk() + "\n";
    }
}
