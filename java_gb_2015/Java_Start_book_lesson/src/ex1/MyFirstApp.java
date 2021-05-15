package ex1;

public class MyFirstApp {
    static int z;
    public static void main(String[] args) {
        int x = 1;

        while (x < 2) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;
            z = x + 2;
        }
        if (x == 2) {
            System.out.println("Do");
        }
    }

}
