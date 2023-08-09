
public class Warrior extends Characters{
    private String Char = "Warrior";
    private Weapons weapon;
    private String shield;

    public String getChar() {
        return Char;
    }

    public void setChar(String aChar) {
        Char = aChar;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
    public String getShield() {
        return shield;
    }
    public void setShield(String shield) {
        this.shield = shield;
    }
    public Warrior (){
        super();
    }
    public Warrior(String name){
        super(name);
    }
    public Warrior(String name, int life, int atk) {
        super(name, life, atk);
    }
    public String toString() {
        return Char+": " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getAtk() + "\n";
    }
}
