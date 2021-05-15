package basic.section4;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] tempArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            tempArray[index] = array[i];
            index++;
        }
        array = tempArray;

        System.out.println(Arrays.toString(array));
    }
}
