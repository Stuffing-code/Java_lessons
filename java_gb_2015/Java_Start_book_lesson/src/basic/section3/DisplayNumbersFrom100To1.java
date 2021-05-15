package basic.section3;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {


        {
            for (int i = 100; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println();
        }
        {
            var from = 0;
            var to = 100;
            var step = 1;

            while (from <= to) {
                System.out.print(from + " ");
                from += step;
            }
            System.out.println();
        }
        {
            var from = 0;
            var to = 100;
            var step = 1;

            do {
                System.out.print(from + " ");
                from += step;
            } while (from < to);
            System.out.println();
        }
    }
}
