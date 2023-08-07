import java.util.Scanner;

public class Menu {
    public static void createChar() {
        System.out.println("choississez un personnage : \n1: Magician  \n2: Warrior \n3: Exit");
        //recuperation des input dans une variable avec la methode scanner
        Scanner input =   new Scanner(System.in);
        String answer = input.nextLine();
        //selection de choix avec la methode switch
        switch(answer){

            case "1":
                //affiche warrior et donner un nom
                System.out.println("Magician !");
                System.out.println("Donnez un nom a votre personnage");
                // recupere dans une variable name l'entree en string du clavier
                String name = input.next();
                input.nextLine();
                //Magician magician = new Magician(name);
                System.out.println("Donnez vos points de vie");
                int life = input.nextInt();
                input.nextLine();

                System.out.println("Donnez votre force d'attaque");
                int atk = input.nextInt();
                input.nextLine();
                //j'instancie le nouvel objet créé magician
                Magician magician = new Magician(name,life,atk);
                //j'affiche les informations de l'objet magician
                System.out.println(magician);
                //System.out.println("Votre :"+"Magician"+" s'appelle " +name + " il a " + life +" point de vie "+ "et "+ atk+" d'attaque");
                System.out.println();
                try {
                    modify(magician);
                } catch (CharacterOutOfBoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "2":

                System.out.println("Warrior");
                System.out.println("Donnez un nom a votre personnage");
                name = input.next();
                input.nextLine();

                System.out.println("Donnez vos points de vie");
                life = input.nextInt();
                input.nextLine();

                System.out.println("Donnez votre force d'attaque");
                atk = input.nextInt();
                input.nextLine();
                Characters warrior = new Warrior(name,life,atk);
                System.out.println(warrior);
                //System.out.println("Votre "+"Warrior"+" s'appelle " +name + " il a " + life +" point de vie "+ "et "+ atk+" d'attaque");
                System.out.println();
                modify(warrior);
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
    public static void modify(Magician magician) throws CharacterOutOfBoundException {
        System.out.println("voulez vous : \n1: Voir mon personnage  \n2: Modifier mon personnage \n3: Lancer partie \n4: Exit");
        Scanner input = new Scanner(System.in);
        String modify = input.nextLine();
        switch(modify){
            case "1":
                System.out.println("voir mon Magicien");
                System.out.println(magician);
                modify(magician);
                break;
            case "2":
                System.out.println("Modifier mon Magicien");
                System.out.println("Renommer mon personnage");
                // recupere dans une variable name l'entree en string du clavier
                String name = input.next();
                input.nextLine();
                //Magician magician = new Magician(name);
                System.out.println("Redonnez vos points de vie");
                int life = input.nextInt();
                input.nextLine();

                System.out.println("Redonnez votre force d'attaque");
                int atk = input.nextInt();
                input.nextLine();
                //j'instancie le nouvel objet créé magician
                magician = new Magician(name,life,atk);
                //j'affiche les informations de l'objet magician
                System.out.println(magician);
                //System.out.println("Votre :"+"Magician"+" s'appelle " +name + " il a " + life +" point de vie "+ "et "+ atk+" d'attaque");
                System.out.println();
                modify(magician);
                break;
            case "3":
                System.out.println("Vous avez lancé une partie");

                try {
                    int counts =0;
                    while (magician.getPosition() < 64) {
                        System.out.println("vous êtes a la case : " + magician.getPosition() + "/64");
                        Dice dice = new Dice();
                        int deValue = dice.getResult();
                        counts++;
                        System.out.println("votre  lancé : " + deValue);
                        magician.setPosition(magician.getPosition() + deValue);
                        if (magician.getPosition() == 64){
                            System.out.println("Vous avez gagné\n");
                        }
                        else if(magician.getPosition() > 64){
                            throw new CharacterOutOfBoundException("Vous avez perdu\n");
                        }
                        System.out.println(counts);
                    }
                    //System.out.println("win"+magician.getPosition());
                }
                catch(CharacterOutOfBoundException e){
                    System.out.println("Dommage : " + e.getMessage());
                    modify(magician);
                }
                break;
            case "4":
                System.out.println("Exit");
                modify(magician);
                break;

        }
    }
    public static void modify(Warrior warrior){
        System.out.println("voulez vous : \n1: Voir mon personnage  \n2: Modifier mon personnage \n3: Lancer partie \n4: Exit");
        Scanner input = new Scanner(System.in);
        String modify = input.nextLine();
        switch(modify){
            case "1":
                System.out.println("Voir mon Warrior");
                System.out.println(warrior);
                break;
            case "2":
                System.out.println("Modifier mon Warrior");
                System.out.println("Renommer mon personnage");

                String name = input.next();
                input.nextLine();

                System.out.println("Redonnez vos points de vie");
                int life = input.nextInt();
                input.nextLine();

                System.out.println("Redonnez votre force d'attaque");
                int atk = input.nextInt();
                input.nextLine();

                warrior = new Warrior(name,life,atk);

                System.out.println(warrior);
                //System.out.println("Votre :"+"Magician"+" s'appelle " +name + " il a " + life +" point de vie "+ "et "+ atk+" d'attaque");
                System.out.println();
                modify(warrior);
                break;
            case "3":
                System.out.println("Vous avez lancé une partie");
                try {
                    while (warrior.getPosition() < 64) {
                        System.out.println("vous êtes a la case : " + warrior.getPosition() + "/64");
                        Dice dice = new Dice();
                        int deValue = dice.getResult();
                        System.out.println("votre  lancé : " + deValue);
                        warrior.setPosition(warrior.getPosition() + deValue);
                        if (warrior.getPosition() == 64){
                            System.out.println("Vous avez gagné");
                        }
                        else if(warrior.getPosition() > 64){
                            throw new CharacterOutOfBoundException("Vous avez perdu");
                        }
                    }
                }
                catch(CharacterOutOfBoundException e){
                    System.out.println("Dommage : " + e.getMessage());
                }
                modify(warrior);
                break;
            case "4":
                System.out.println("Exit");
                break;
        }
    }
}