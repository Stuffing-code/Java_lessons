package basic.section4;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};
        System.out.println(Arrays.toString(array));

        int[] tempMinValue = new int[2];
        int[] tempMaxValue = new int[2];
        int valueMax = array[0];
        int valueMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valueMax) {
                valueMax = array[i];
                tempMaxValue[0] = valueMax;
                tempMaxValue[1] = i;
            } else if (array[i] < valueMin) {
                valueMin = array[i];
                tempMinValue[0] = valueMin;
                tempMinValue[1] = i;
            }
        }
        array[tempMinValue[1]] = tempMaxValue[0];
        array[tempMaxValue[1]] = tempMinValue[0];

        System.out.println(Arrays.toString(array));
    }
}
