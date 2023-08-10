import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);;
    public int nbCase;
    Board board = new Board(nbCase);
    private int position = 1;

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public void start(Board board) {
        String answer = input.nextLine();
        switch(answer){
            case "1":
                System.out.println("Lancer le dé");
                answer = input.next();
                break;
            case "2":
                System.out.println("Exit");
                break;
        }
        try {

            setPosition(1);
            int counts = 0;
            while (getPosition() < board.getBoard().size()) {
                System.out.println("vous êtes a la case : " + getPosition() +  "\n"+board);
                //utilisation de l'interface pour choisir le dé
                Dices dice = new loadedDice();
                int deValue = dice.getResult();
                counts++;
                System.out.println("votre lancé : " + deValue);
                setPosition(getPosition() + deValue);
                if (getPosition() == board.getBoard().size()) {
                    System.out.println("Vous avez gagné\n");
                } else if (getPosition() > board.getBoard().size()) {
                    throw new CharacterOutOfBoundException("Vous avez perdu\n");
                }
                System.out.println(counts);
            }
        } catch (CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
    }
}
