package basic2.java0.collections.arrays;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradeArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        System.out.println("Minimal grade " + calcMin(gradeArray));
//        varArgs();
        processArrays();
    }


    private static int calcMin(int[][] grades) {
        int min = 100;
        for (int[] row :
                grades) {
            for (int i :
                    row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

    private static void varArgs() {
        double a = 0.56;
        double b = 1.92;
        double c = 3.45;
        double d = 5.01;

        System.out.println("Average of 2 elements is  " + calcAverege(a, b));
        System.out.println("Average of 3 elements is  " + calcAverege(a, b, c));
        System.out.println("Average of 4 elements is  " + calcAverege(a, b, c, d));
    }

    private static double calcAverege(double... args) {
        double sum = 0;
        for (double i : args) {
            sum += i;
        }
        return sum / args.length;
    }

    private static void processArrays() {
        double[] doubleArray = {8.9, 5.64, 8.12, 45.0, 71.1};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] fillArray = new int[7];
        Arrays.fill(fillArray, 7);
        System.out.println(Arrays.toString(fillArray));

        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = new int[10];
        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        System.out.println(Arrays.toString(arrayCopy));
    }
}
