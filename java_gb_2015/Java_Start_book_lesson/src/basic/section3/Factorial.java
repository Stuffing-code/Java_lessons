package basic.section3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int userCase = 0;

        while (true) {
            System.out.println("Enter number for Factorial");
            userCase = new Scanner(System.in).nextInt();
            if (userCase < 0) {
                System.out.println("Value should be >=0");
            } else {
                break;
            }
        }
        String finalResult = null;
        var result = 1;
        for (int i = 1; i <= userCase; i++) {
            var oldResult = result;
            result *= i;
            if (oldResult != result / i) {
                result = 0;
                finalResult = "Int overflow";
                break;
            } else {
                finalResult = String.valueOf(result);
            }
        }
        System.out.println(finalResult);

    }
}
