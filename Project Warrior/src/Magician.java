
public class Magician extends Characters {

    private String sort;
    private String philtre;

    public Magician(String name, int life, int atk) {
        super(name, life, atk);
    }

    public String getSort() {
        return sort;
    }

    public String getPhiltre() {
        return philtre;
    }



    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }
    public String toString() {
        return "Magician: " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getAtk() + "\n";
    }
}
