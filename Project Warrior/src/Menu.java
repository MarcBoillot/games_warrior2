import java.util.List;
import java.util.Scanner;

public class Menu {
    public void displayHeroDetails(Characters hero) {
        System.out.println("Type: " + hero.getType());
        System.out.println("Nom: " + hero.getName());
        System.out.println("Force: " + hero.getStrength());
        System.out.println("Vie: " + hero.getLife());
        System.out.println("------------------------");
    }

    public void createChar() {
        System.out.println("choississez un personnage : \n1: magician  \n2: warrior \n3: Exit");
        //recuperation des input dans une variable avec la methode scanner
        String answer =userInput();
        //selection de choix avec la methode switch





        Scanner scanner = new Scanner(System.in);

        List<Characters> heroes = DataBase.getHeroes();

        System.out.println("Veuillez sélectionner un personnage :");

        for (int i = 0; i < heroes.size(); i++) {
            Characters hero = heroes.get(i);
            System.out.println((i + 1) + ". " + hero.getName() + " (" + hero.getType() + ")" );
            System.out.println("Vie : "+hero.getLife());
            System.out.println("Force :"+hero.getStrength());
            System.out.println("---------------------------");
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice >= 1 && choice <= heroes.size()) {
            Characters selectedHero = heroes.get(choice - 1);
            System.out.println("Vous avez choisi " + selectedHero.getType() + " !");
            displayHeroDetails(selectedHero);
        } else {
            System.out.println("Choix invalide !");
        }


        switch(answer){

            case "1":
                System.out.println("magician !");
                createCharacter(answer);
                System.out.println();
                break;
            case "2":
                System.out.println("warrior !");
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
                System.out.println("reponse1"+magician);
                modify(magician);
                break;
            case"2":
                Characters warrior = new Warrior(name);
                System.out.println("reponse2"+warrior);
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
        int strength = userInputInt();

        update_character(characters, name, life, strength);

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

    private void update_character(Characters characters, String name, int life, int strength) {
        characters.setName(name);
        characters.setLife(life);
        characters.setStrength(strength);
    }
}