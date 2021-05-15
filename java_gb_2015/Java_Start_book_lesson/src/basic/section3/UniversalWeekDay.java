package basic.section3;

import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {
        System.out.println("Enter number week day:");
        var numberDay = new Scanner(System.in).nextInt();
        System.out.println("Enter is monday first? (yes or no)");
        var yesOrNo = new Scanner(System.in).nextLine();
        boolean isMondayFirst = true;

        // processing
        if (yesOrNo.equals("yes")) {
            isMondayFirst = true;
        } else if (yesOrNo.equals("no")) {
            isMondayFirst = false;
        } else {
            System.out.println("Error");
        }

        String result = "Error";
        if (isMondayFirst) {
            if (numberDay == 1) {
                result = "Monday";
            } else if (numberDay == 2) {
                result = "Tuesday";
            } else if (numberDay == 3) {
                result = "Wednesday";
            } else if (numberDay == 4) {
                result = "Thursday";
            } else if (numberDay == 5) {
                result = "Friday";
            } else if (numberDay == 6) {
                result = "Saturday";
            } else if (numberDay == 7) {
                result = "Sunday";
            } else {
                result = "invalid day";
            }
        } else {
            if (numberDay == 1) {
                result = "Sunday";
            } else if (numberDay == 2) {
                result = "Monday";
            } else if (numberDay == 3) {
                result = "Tuesday";
            } else if (numberDay == 4) {
                result = "Wednesday";
            } else if (numberDay == 5) {
                result = "Thursday";
            } else if (numberDay == 6) {
                result = "Friday";
            } else if (numberDay == 7) {
                result = "Monday";
            } else {
                result = "invalid day";
            }
        }

        System.out.println(result);
    }
}
