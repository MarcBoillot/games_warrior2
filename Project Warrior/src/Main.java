public class Main {
    public static void main(String[] args) {
        System.out.println("Début du jeu");
        Dice dice = new Dice();
        System.out.println(dice.getResult());
        Menu menu = new Menu();
        menu.createChar();
    }
}