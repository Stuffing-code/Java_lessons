package hours_80;

public class Root_search {
    //    (a*(x**2)) + (b*x) + c == 0
    public static void rootSearch(int a, int b, int c) {

        while (true) {
            if (a == 0) {
                System.out.println("Enter please inger and non zero value 'a'");
                break;
            } else{
                int discriminant = ((b * b) - (4 * a * c));
                int root_1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
                int root_2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
                if (discriminant == 0) {
                    System.out.println("root = " + root_1);
                    break;
                } else if (discriminant > 0) {
                    System.out.println("root's = " + root_1 + ", " + root_2 + ".");
                } else {
                    System.out.println("No rational solution");
                }
            }
        }
    }
}
