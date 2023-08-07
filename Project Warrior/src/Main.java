public class Main {
    public static void main(String[] args) {
        System.out.println("Début du jeu");
        De de = new De();
        System.out.println(de.getResult());
        Menu menu = new Menu();
        menu.createChar();
    }
}