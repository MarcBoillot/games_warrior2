 public abstract class Characters {
    private String name;
    private  int life;
    private int atk;

    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAtk() {
        return atk;
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

    public Characters(){
        this.name="default name";
        this.life=1;
        this.atk=2;
    }
    public Characters(String name){
        this.name=name;
        this.life=10;
        this.atk=20;
    }
    public Characters(String name, int life, int atk){
        this.name = name;
        this.life = life;
        this.atk = atk;
    }
     public String toString() {
         return "  : " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getAtk() + "\n";
     }
}
