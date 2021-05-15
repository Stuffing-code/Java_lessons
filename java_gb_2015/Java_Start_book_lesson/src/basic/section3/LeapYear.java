package basic.section3;

public class LeapYear {
    public static void main(String[] args) {
        var year = 2019;

        String result;

        if ((year % 400) == 0) {
            result = "Visokosnii";
        } else if ((year % 100) == 0) {
            result = "ne visokosnii";
        } else if ((year % 4) == 0) {
            result = "visokosnii";
        } else {
            result = "nevisokosnii";
        }

        System.out.println(result);
    }
}


