public class Dice {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public Dice() {
        result = (int)(Math.random() * 5)+1;
    }
}
