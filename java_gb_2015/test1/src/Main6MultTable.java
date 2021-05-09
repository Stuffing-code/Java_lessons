public class Main6MultTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // sout
//                System.out.print(j + " * " + i + " == " + i * j + '\t' + '\t');
                //souf
                System.out.printf("%d * %d == %d\t\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
