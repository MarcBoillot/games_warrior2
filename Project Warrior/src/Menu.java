import java.util.Scanner;

public class Menu {
    Scanner input;
    Game game;
    Board board;
    public Menu(){
        game = new Game();
        input = new Scanner(System.in);
        board = new Board();
    }
    public void createChar() {
        System.out.println("choississez un personnage : \n1: Magician  \n2: Warrior \n3: Exit");
        //recuperation des input dans une variable avec la methode scanner
        input =   new Scanner(System.in);
        String answer = input.nextLine();
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
        String name = input.nextLine();

        /*System.out.println("Donnez vos points de vie");
        int life = input.nextInt();

        System.out.println("Donnez votre force d'attaque");
        int atk = input.nextInt();*/

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
        input.nextLine();
        System.out.println("Souhiatez vous : \n1: Voir votre personnage  \n2: Modifier votre personnage \n3: Lancer partie \n4: Exit");


        String answer = input.nextLine();

        switch(answer){

            case "1":
                System.out.println("Mes Stats !");
                System.out.println(characters);
                modify(characters);
                System.out.println();
                break;
            case "2":
                System.out.println("Modifier !");
                System.out.println("Renommer mon personnage");
                String name = input.next();

                System.out.println("Donnez vos points de vie");
                int life = input.nextInt();

                System.out.println("Donnez votre force d'attaque");
                int atk = input.nextInt();

                update_character(characters, name,life,atk);

                System.out.println(characters);
                System.out.println();
                modify(characters);
                System.out.println();
                break;
            case "3":
                while(answer.equals("3")){
                    System.out.println("Vous avez lancé une partie");
                    game.start(board);
                    System.out.println("3: Relancer une partie\n4: Exit");
                    answer = input.nextLine();
                }
                break;
            case "4":
                System.out.println("Exit");
                modify(characters);
                break;
            default:
                System.out.println("Choix incorrect");
                modify(characters);
                break;
        }
    }
    private void update_character(Characters characters, String name, int life, int atk) {
        characters.setName(name);
        characters.setLife(life);
        characters.setAtk(atk);
    }
}