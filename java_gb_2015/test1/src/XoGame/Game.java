package XoGame;

import java.util.Scanner;

public class Game {
    boolean endgame = true;
    static Field cells = new Field();


    void startGame() {
        do {

            if (Player.playerAmount < 2) {
                System.out.println("Введите ваше имя ");
                Scanner scanner1 = new Scanner(System.in);
                String namePlayer1;
                namePlayer1 = scanner1.nextLine();
                Player player1 = new Player(namePlayer1);
                player1.helloPlayer(namePlayer1);
                System.out.println("Введите ваше имя ");
                Scanner scanner2 = new Scanner(System.in);
                String namePlayer2;
                namePlayer2 = scanner2.nextLine();
                Player player2 = new Player(namePlayer2);
                player2.helloPlayer(namePlayer2);
            }

            int xX = setCordsX();
            int yX = setCordsY();
            cells.drowX(xX, yX);
            int xO = setCordsX();
            int yO = setCordsY();
            cells.drowO(xO, yO);

        } while (endgame);
    }

    Integer setCordsX() {
        System.out.println("Введите координату Х");
        Scanner scannerX = new Scanner(System.in);
        String sX;
        sX = scannerX.nextLine();
        int x = Integer.parseInt(sX);
        return x - 1;
    }

    Integer setCordsY() {
        System.out.println("Введите координату Y");
        Scanner scannerY = new Scanner(System.in);
        String sY;
        sY = scannerY.nextLine();
        int y = Integer.parseInt(sY);
        return y - 1;
    }


}
