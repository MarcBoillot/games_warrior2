public class Game {
    private int position = 1;

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    Board board = new Board();
    public void start(Board board) {
        try {
            setPosition(1);
            int counts = 0;
            while (getPosition() < board.getBoard()) {
                System.out.println("vous êtes a la case : " + getPosition() +  board);
                //utilisation de l'interface pour choisir le dé
                Dices dice = new TwoDices();
                int deValue = dice.getResult();
                counts++;
                System.out.println("votre lancé : " + deValue);
                setPosition(getPosition() + deValue);
                if (getPosition() == board.getBoard()) {
                    System.out.println("Vous avez gagné\n");
                } else if (getPosition() > board.getBoard()) {
                    throw new CharacterOutOfBoundException("Vous avez perdu\n");
                }
                System.out.println(counts);
            }
        } catch (CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
    }
}
