package basic.section4;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        var result = 0;
        for (int element : array) {
            result += element;
        }
        System.out.println(result);
    }
}
