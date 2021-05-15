package basic.section4;

public class NewArray {
    public static void main(String[] args) {
        int[] arrayWithValues1 = {1, 2, 3, 4, 5};
        double[] arrayWithValues2 = {1., 2., 3., 4., 5.};
        boolean[] arrayWithValues3 = {true, false, true, false};
        char[] arrayWithValues4 = {'1', '2', '3', '4', '5'};
        String[] arrayWithValues5 = {"1", "2", "3", "4"};

        int[] arrayWithSize1 = new int[5];  // 0
        double[] arrayWithSize2 = new double[5]; // 0.0
        boolean[] arrayWithSize3 = new boolean[5]; // false
        char[] arrayWithSize4 = new char[5]; // \u0000
        String[] arrayWithSize5 = new String[5]; // null

        int[] emptyArray1 = {};
        int[] emptyArray2 = new int[0];

    }


}
