package basic.section2;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        var name = new Scanner(System.in).nextLine();

        var result = "Hello, " + name;

        System.out.println(result);
    }
}
