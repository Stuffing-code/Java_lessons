package basic.section3;

public class NumberReverse {
    public static void main(String[] args) {
        var number = 21;

        System.out.println("Исходное число: " + number);
        System.out.print("Реверсивная версия: ");

        var i = 0;
        while (i < number) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
        System.out.println("------------------------------");

        }
    }

