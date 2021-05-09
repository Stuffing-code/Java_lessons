public class Main3ifSwitch {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        int grade = 50;
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Norm");
                break;
            default:
                System.out.println("out of range");
        }
    }
}
