public class Characters {
    private int position;
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
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    private Characters(){}
    private Characters(String name){
        this.name = name;
    }
    public Characters(String name, int life, int atk){
        this.name = name;
        this.life = life;
        this.atk = atk;
    }

}
