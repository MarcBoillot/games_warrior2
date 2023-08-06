
public class Warrior {
    public String name;
    private int life;
    private int atk;
    private String weapon;
    private String shield;
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
        return "Warrior: " + "\nName: "+name + "\nLife: " + life + "\nAttack: " + atk;
    }
}
