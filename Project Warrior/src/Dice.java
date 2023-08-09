public class Dice implements Dices{
      @Override
    public int getResult() {
        return  (int)(Math.random() * 5)+1;
    }
}
