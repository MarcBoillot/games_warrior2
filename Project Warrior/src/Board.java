public class Board {
    private int numberCases = 64;
    private int board = numberCases;
    public int getNumberCases() {
        return numberCases;
    }
    public void setNumberCases(int numberCases) {
        this.numberCases = numberCases;
    }
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
