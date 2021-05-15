package basic.section4;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        System.out.println(array1[0]);

        array1[0] = 112;
        System.out.println(Arrays.toString(array1));

        System.out.print(array1[0] + " ");
        System.out.print(array1[1] + " ");
        System.out.print(array1[2] + " ");
        System.out.print(array1[3] + " ");
        System.out.print(array1[4] + " ");

    }
}
