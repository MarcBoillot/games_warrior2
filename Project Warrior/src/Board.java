public class Board {
    private int position = 1;
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumberCases() {
        return numberCases;
    }

    public void setNumberCases(int numberCases) {
        this.numberCases = numberCases;
    }

    private int numberCases = 4;

    private int board = numberCases;
    public int getBoard() {
        return board;
    }
    public void setBoard(int board) {
        this.board = board;
    }
    public String toString() {
        return "/"+getBoard();
    }
}
