package ex3;

import java.io.IOException;

public class Game {

    public static void main(String[] args) throws IOException {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (theDotCom.result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалос " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
