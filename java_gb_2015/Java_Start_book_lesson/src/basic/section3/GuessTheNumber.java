package basic.section3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        while (true) {
            System.out.println("Enter number:");
            var userNumber = new Scanner(System.in).nextInt();
            if (userNumber == number) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (userNumber > number) {
                System.out.println("number < " + userNumber + ". Try again.");
            } else {
                System.out.println("number > " + userNumber + ". Try again.");
            }
        }
//        String result;
//        if (userNumber == number) {
//            result = "Congratulations, you guessed the number!";
//        } else{
//            result = "Sorry, but your number is invalid! Try again later...";
//        }


//        System.out.println(
//                userNumber==number ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");

//        System.out.println(result);
    }
}
