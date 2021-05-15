package basic.section3;

import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        var firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Enter second number:");
        var secondNumber = new Scanner(System.in).nextInt();

        String result = firstNumber > secondNumber ?
                "max number " + firstNumber :
                "max number " + secondNumber;

        System.out.println(result);
    }
}
