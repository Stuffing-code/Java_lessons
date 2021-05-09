package XoGame;

import java.util.Scanner;

public class Player {
    String name;
    static int playerAmount;

    public Player(String name) {
        this.name = name;
        playerAmount++;
    }

    void helloPlayer(String name) {
        System.out.printf("Hello player %d %S\n", playerAmount, name);
    }




}

