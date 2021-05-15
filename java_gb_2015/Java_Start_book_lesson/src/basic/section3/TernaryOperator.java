package basic.section3;

public class TernaryOperator {
    public static void main(String[] args) {
        var a = 7;

        if (a == 5) {
            System.out.println("a == 5");
        } else {
            System.out.println("a != 5");
        }

        System.out.println(a == 5 ? "a == 5": "a != 5");
    }
}
