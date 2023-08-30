package fr.campusNum.dd.dices;

public class Dice implements Dices{
      @Override
    public int getResult() {
        return  (int)(Math.random() * 6)+1;
    }
}
