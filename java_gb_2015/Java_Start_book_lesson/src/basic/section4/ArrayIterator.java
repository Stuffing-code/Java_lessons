package basic.section4;

public class ArrayIterator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element);
        }

    }
}
