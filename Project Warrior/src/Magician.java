
public class Magician extends Characters {
    public String Char = "Magician";
    public Sorts sort;
    private String philtre;

    public String getPhiltre() {
        return philtre;
    }
    public void setPhiltre(String philtre) {
        this.philtre = philtre;
    }
    public Magician(){
        super ();
    }
    public Magician(String name){
        super(name);
    }
    public Magician(String name, int life, int atk) {
        super(name, life, atk);
    }

    public String toString() {
        return Char+": " +"\nName: "+ getName() + "\nLife: " + getLife() + "\nAttack: " + getAtk() + "\n";
    }
}
