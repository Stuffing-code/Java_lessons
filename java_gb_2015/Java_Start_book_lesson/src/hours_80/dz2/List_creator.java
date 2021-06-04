package hours_80.dz2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class List_creator {
    static int count = 0;

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    // solve median array
    public static double solveMedianDouble(int number_1, int number_2) {
        return (double) (number_1 + number_2) /2;
    }

    public static int solveMedianInt(int number_1, int number_2) {
        return (number_1 + number_2) /2;
    }

    // check double or int type
    public static boolean checkMedian_type(int number_1, int number_2) {
        return (number_1 + number_2) % 2 == 1;
    }

    // display array on the console
    public static void displayList(LinkedList<Integer> list) {
//        System.out.print("List_creator: displayList(): [");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i < 7) {
                System.out.print(list.get(i) + ",");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.print("] -> ");
    }

//    main method
    public static void fifo(LinkedList<Integer> list, int number) {
        if (list.size() == 8) {
            LinkedList<Integer> list_temp = new LinkedList<>(list); // create temp arry
            displayList(list);
//            displayList(list_temp);
//            System.out.println();
            Collections.sort(list_temp); // sort list
//            displayList(list);
            displayList(list_temp);
            boolean check = checkMedian_type(list_temp.get(4), list_temp.get(3));
            if (check) {
//            System.out.println("List_creator: fifo(): " + solveMedianDouble(list_temp.get(4), list_temp.get(3)));
                System.out.println("[" + solveMedianDouble(list_temp.get(4), list_temp.get(3)) + "]");
            } else {
//            System.out.println("List_creator: fifo(): " + solveMedianInt(list_temp.get(4), list_temp.get(3)));
                System.out.println("[" + solveMedianInt(list_temp.get(4), list_temp.get(3)) + "]");
            }
            list.pop(); // remove first element
        }
        list.add(count, number);

        if (count < 7) {
            count++;
        }
    }



}
