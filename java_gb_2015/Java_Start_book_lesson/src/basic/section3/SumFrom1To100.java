package basic.section3;

public class SumFrom1To100 {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;
        var result = 0;

        for (int i = from; i <= to; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
