package basic.section3;

public class While {
    public static void main(String[] args) {
        {
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            int i = 0;
            while (i < 5) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }
}
