package basic.section2;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        var result = a + b * 5 - (7 * a);

        System.out.println(result);
    }
}
