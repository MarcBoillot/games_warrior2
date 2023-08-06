
public class Magician {
    private String name;
    private  int life;
    private int atk;
    private String sort;
    private String philtre;
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

    public String getSort() {
        return sort;
    }

    public String getPhiltre() {
        return philtre;
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

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }

    //ci-dessous l'objet Magician est un constructeur et aussi une instance de la class Magician
    private Magician(){}
    private Magician(String name){
        this.name = name;
    }
    public Magician(String name, int life, int atk){
        this.name = name;
        this.life = life;
        this.atk = atk;
    }
    public String toString() {
        return "Magician: " +"\nName: "+ name + "\nLife: " + life + "\nAttack: " + atk + "\n";
    }
}
