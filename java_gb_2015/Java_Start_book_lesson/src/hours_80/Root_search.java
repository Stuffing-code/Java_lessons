package hours_80;

public class Root_search {
    //    (a*(x**2)) + (b*x) + c == 0
    public static void rootSearch(int a, int b, int c) {

        while (true) {
            if (a == 0 && b != 0 && c != 0) {
                double result = ((double)-c / b);
                System.out.println(result);
                break;
            } else if (a == 0 && b == 0 && c != 0) {
                System.out.println("No rational solution, cannot be divisible by 0");
                break;
            } else if (a == 0 && b == 0 && c == 0) {
                System.out.println("result any number");
                break;
            } else {
                int discriminant = ((b * b) - (4 * a * c));
                int result_1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
                int result_2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
                if (discriminant == 0) {
                    System.out.println("result = " + result_1);
                    break;
                } else if (discriminant > 0) {
                    System.out.println("result's = " + result_1 + ", " + result_2 + ".");
                } else {
                    System.out.println("No rational solution");
                }
            }
        }
    }
}
