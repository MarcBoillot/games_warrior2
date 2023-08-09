public class TwoDices implements Dices{
    public int DiceOne = (int)(Math.random() * 6)+1;
    public int DiceTwo = (int)(Math.random() * 6)+1;
    @Override
    public int getResult() {
        return DiceOne + DiceTwo;
    }
}
