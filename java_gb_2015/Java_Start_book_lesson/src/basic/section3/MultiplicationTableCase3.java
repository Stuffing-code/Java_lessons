package basic.section3;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        var to = 9;
        var center = (to / 2) + (to % 2);

        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= center; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 2; i <= to; i++) {
            for (int j = center + 1; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}

