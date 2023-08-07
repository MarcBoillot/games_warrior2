
public class Warrior extends Characters{
    public String Char = "Warrior";
    public Weapons weapon;
    private String shield;
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
