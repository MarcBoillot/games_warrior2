public class Game {
    public void start(Characters characters) {
        try {
            int counts = 0;
            while (characters.getPosition() < 64) {
                System.out.println("vous êtes a la case : " + characters.getPosition() + "/64");
                Dice dice = new Dice();
                int deValue = dice.getResult();
                counts++;
                System.out.println("votre lancé : " + deValue);
                characters.setPosition(characters.getPosition() + deValue);
                if (characters.getPosition() == 64) {
                    System.out.println("Vous avez gagné\n");
                } else if (characters.getPosition() > 64) {
                    throw new CharacterOutOfBoundException("Vous avez perdu\n");
                }
                System.out.println(counts);
            }
        } catch (CharacterOutOfBoundException e) {
            System.out.println("Dommage : " + e.getMessage());
        }
    }
}
