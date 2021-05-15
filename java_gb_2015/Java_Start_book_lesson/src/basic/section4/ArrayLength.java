package basic.section4;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 421412};
        System.out.println(Arrays.toString(array1));

        System.out.println(array1.length);
        System.out.println(array1[array1.length - 1]);
    }
}
