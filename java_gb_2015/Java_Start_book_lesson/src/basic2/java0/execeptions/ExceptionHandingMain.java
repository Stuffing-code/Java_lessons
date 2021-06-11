package basic2.java0.execeptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandingMain {

    public static void main(String[] args) {
//        try {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
//        } catch (NullPointerException e) {
//            System.out.println("NPE");
//            e.printStackTrace();
//            System.out.println("=================================");
//            Throwable[] suppressed = e.getSuppressed();
//            System.out.println(suppressed[0]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"))) {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
//                System.out.println(divide(numerator, denominator));
//                safeToFail());
//                int[] intArray = new int[1];
//                int i = intArray[2];
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
//                System.out.println("All Exception here");
                throw new InvalidInputParamException("Index out of bound. Throw id doEverything");
            } finally {
                System.out.println("Finaly block called");
//                if (writer != null) {
//                    writer.close();
////                }
            }
            System.out.println("Try catch block finished");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }
//
//    private static void safeToFail(int result) throws IOException {
//
//    }
}
