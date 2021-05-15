package basic.section3;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        {
            var from = 0;
            var to = 50;
            var step = 2;

            for (int i = from; i <= to; i += step) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            var from = 0;
            var to = 50;
            var step = 2;

            while (from <= to) {
                System.out.print(from + " ");
                from += step;
            }
            System.out.println();
        }
        {
            var from = 0;
            var to = 50;
            var step = 2;

            do {
                System.out.print(from + " ");
                from += step;
            } while (from <= to);
            System.out.println();
        }
    }
}
