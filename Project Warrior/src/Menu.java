import java.util.Scanner;

public class Menu {
    public void createChar() {
        System.out.println("choississez un personnage : \n1: Magician  \n2: Warrior \n3: Exit");
        //recuperation des input dans une variable avec la methode scanner
        String answer =userInput();
        //selection de choix avec la methode switch
        switch(answer){

            case "1":
                System.out.println("Magician !");
                createCharacter(answer);
                System.out.println();
                break;
            case "2":
                System.out.println("Warrior !");
                createCharacter(answer);
                System.out.println();
                break;
            case "3":
                System.out.println("Exit");
                break;
            default:
                System.out.println("Choix incorrect");
                createChar();
                break;
        }
    }
    public void createCharacter(String answer){


        System.out.println("Donnez un nom a votre personnage");
        String name =userInput();
        switch (answer){
            case "1":
                Characters magician = new Magician(name);
                System.out.println(magician);
                modify(magician);
                break;
            case"2":
                Characters warrior = new Warrior(name);
                System.out.println(warrior);
                modify(warrior);
                break;
        }
        System.out.println();
    }
    public void modify(Characters characters) {
        System.out.println("Souhaitez vous : \n1: Voir votre personnage  \n2: Modifier votre personnage \n3: Lancer partie \n4: Exit");
        String answer = userInput();
            switch (answer) {

                case "1":

                    System.out.println("Mes Stats !");
                    System.out.println(characters);
                    System.out.println();

                    break;
                case "2":
                    updateMenu(characters);
                    break;
                case "3":
                    launcher();
                    break;
                case "4":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        if(answer.equals("1") || answer.equals("2") ){
            modify(characters);
        }
    }

    private void launcher() {
        new Game().game();
    }

    private void updateMenu(Characters characters) {
        System.out.println("Modifier !");
        System.out.println("Renommer mon personnage");
        String name = userInput();

        System.out.println("Donnez vos points de vie");
        int life = userInputInt();

        System.out.println("Donnez votre force d'attaque");
        int atk = userInputInt();

        update_character(characters, name, life, atk);

        System.out.println(characters);
        System.out.println();

        System.out.println();
    }
    public String userInput(){
       Scanner input = new Scanner(System.in);
       return input.nextLine();
    }
    private int userInputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void update_character(Characters characters, String name, int life, int atk) {
        characters.setName(name);
        characters.setLife(life);
        characters.setAtk(atk);
    }
}