import java.util.Arrays;

public class Main5Array1 {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 3, 5, 22};

        System.out.println(numbers[3]);

        numbers[3] = 12;
        System.out.println(Arrays.toString(numbers));
        // itar + tab
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //iter + tab
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
