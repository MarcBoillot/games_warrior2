public class Game {
    Board board = new Board();
    public void start(Board board) {
        try {
            board.setPosition(1);
            int counts = 0;
            while (board.getPosition() < board.getBoard()) {
                System.out.println("vous êtes a la case : " + board.getPosition() +  board);
                Dice dice = new Dice();
                int deValue = dice.getResult();
                counts++;
                System.out.println("votre lancé : " + deValue);
                board.setPosition(board.getPosition() + deValue);
                if (board.getPosition() == 64) {
                    System.out.println("Vous avez gagné\n");
                } else if (board.getPosition() > 64) {
                    throw new CharacterOutOfBoundException("Vous avez perdu\n");
                }
                System.out.println(counts);
            }
        } catch (CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
    }
}
