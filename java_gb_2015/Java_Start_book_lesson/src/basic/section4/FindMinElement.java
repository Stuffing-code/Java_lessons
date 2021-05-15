package basic.section4;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};

        int minValue = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println(minValue);
    }
}
