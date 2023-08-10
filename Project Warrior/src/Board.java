import java.util.ArrayList;
import java.util.List;
public class Board {
    private List<Cases> board;

    public Board(int nbCase){
        board = generateBoard(nbCase);
    }
    public List<Cases> getBoard(){
        return board;
    }
    public List<Cases> generateBoard (int nbCase){
        ArrayList<Cases> cases = new ArrayList<Cases>(nbCase);
        for (int i = 0; i < nbCase;i ++) {
            cases.add(new Cases(i+1));
        }
        return cases;
    }

    @Override
    public String toString() {
        return ""+board;
    }
}
