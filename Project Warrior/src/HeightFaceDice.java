public class HeightFaceDice implements Dices{

    @Override
    public int getResult() {
        return (int)(Math.random() * 8)+1;
    }
}
