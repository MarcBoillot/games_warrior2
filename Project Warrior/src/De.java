public class De {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public De() {
        result = (int)(Math.random() * 5)+1;
    }
}
