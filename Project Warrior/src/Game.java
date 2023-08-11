import java.util.Scanner;

public class Game {
    public int nbCase = 4;
    private int position = 1;
    Scanner input = new Scanner(System.in);;
    Board board = new Board(nbCase);
    Dice dice = new Dice();

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public void start(Board board) {
        try {
            setPosition(1);
            while (getPosition() < board.getBoard().size()) {
                System.out.println("vous êtes a la case : " + getPosition() +  "\n"+board);

                //utilisation de l'interface pour choisir le dé

                Dices dice = new Dice();
                System.out.println("1.Lancer le dé \n2.Exit");
                String answer = input.next();

                while (!answer.equals("1")){
                    System.out.println("mauvais choix : \nAppuyer sur 1 pour lancer");
                    answer = input.next();
                }

                int deValue = dice.getResult();
                System.out.println("votre lancé : " + deValue);
                setPosition(getPosition() + deValue);

                if (getPosition() == board.getBoard().size()) {
                    System.out.println("Vous avez gagné\n");
                } else if (getPosition() > board.getBoard().size()) {
                    throw new CharacterOutOfBoundException("vous avez perdu");
                }
            }
        } catch (CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
        System.out.println("fin de partie");
    }
}
