package hours_80.dz2;

import java.util.LinkedList;
import java.util.Random;

import static hours_80.dz2.List_creator.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            fifo(list, randomNumber());
        }

        int a = 5;
        int b = 2;
        System.out.println((double)(a + b) / 2);
    }


}
