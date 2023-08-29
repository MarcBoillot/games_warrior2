import java.util.Scanner;

public class Game {

    private int position;
    Scanner input;
    Board board;
    Dice dice;
    public Game(){
        this.input = new Scanner(System.in);
        this.dice = new Dice();
        this.position = 0;
        this.board = new Board();
    }
    public int getPosition() {
        return position;
    }
    public void game(){
        try {
            oneTurn();
        }catch(CharacterOutOfBoundException e){
            System.out.println(e);
        }
    }

    private void oneTurn() throws CharacterOutOfBoundException {
        int diceResult = this.dice.getResult();
        System.out.println("Votre lancé est : "+diceResult);
        System.out.println("position avant lancé"+position);
        movePlayer(diceResult);
        System.out.println("position apres lancé "+position);
        newTurn();
        restart();
        //appeler la focntion rejouer
    }

    private void restart() throws CharacterOutOfBoundException {
        this.position = 0;
        newTurn();
    }

    private void newTurn() throws CharacterOutOfBoundException {
        while (true){
            System.out.println("1.lancer le dé \n2.Quitter ");
            String answer =new Menu().userInput();
            switch (answer){
                case "1":
                    oneTurn();
                    break;
                case "2":
                    System.exit(0);
                default:
                    System.out.println("incorect");
                    break;
            }

        }
    }

    private void movePlayer(int diceResult) {
        this.position += diceResult;
    }

    /*public void start(Board board) {
        try {
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
    }*/
}
