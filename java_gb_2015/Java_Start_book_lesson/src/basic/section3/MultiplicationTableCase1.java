package basic.section3;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        var maxNumber = 19;

        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 0; j < maxNumber; j++) {
                if (((j + 1) * i) == 1) {
                    System.out.print("\t");
                } else {
                    System.out.print((j + 1) * i + "\t");
                }
            }
            System.out.println();
        }
    }
}
