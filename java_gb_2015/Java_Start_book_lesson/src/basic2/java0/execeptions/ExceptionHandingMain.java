package basic2.java0.execeptions;

public class ExceptionHandingMain {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));;
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
