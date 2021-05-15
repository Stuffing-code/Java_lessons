package basic.section3;


import java.util.Scanner;

public class WeekDay {
//"Monday", "Tuesday", "Wednesday",
// "Thursday", "Friday", "Saturday", "Sunday"
public static void main(String[] args) {
    System.out.println("Enter number week day:");
    var numberDay = new Scanner(System.in).nextInt();

    String result;
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
    } else  {
        result = "invalid day";
    }

    System.out.println(result);
}
}
