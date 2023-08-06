
public class Magician {
    public String name;
    public  int life;
    public int atk;
    public String sort;
    public String philtre;
    //ci-dessous l'objet Magician est un constructeur et aussi une instance de la class Magician
    public Magician(){}
    public Magician(String name){
        this.name = name;
    }
    public Magician(String name, int life, int atk){
        this.name = name;
        this.life = life;
        this.atk = atk;
    }
    public String toString() {
        return "Magician: " +"\nName: "+ name + "\nLife: " + life + "\nAttack: " + atk;
    }
}
