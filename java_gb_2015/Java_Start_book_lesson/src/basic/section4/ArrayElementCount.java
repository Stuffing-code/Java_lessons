package basic.section4;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int value = 2;

        int count = 0;
        for (int element : array) {
            if (element == value) {
                count++;
            }
        }

        System.out.println(count);
    }
}
