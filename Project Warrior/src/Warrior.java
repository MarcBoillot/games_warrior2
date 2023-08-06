
public class Warrior {
    private String name;
    private int life;
    private int atk;
    private String weapon;
    private String shield;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAtk() {
        return atk;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getShield() {
        return shield;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public Warrior(){}
    public Warrior (String name){
        this.name = name;
    }
    public Warrior(String name, int life, int atk) {
        this.name = name;
        this.life =life;
        this.atk = atk;
    }
    public String toString() {
        return "Warrior: " + "\nName: "+name + "\nLife: " + life + "\nAttack: " + atk + "\n";
    }
}
