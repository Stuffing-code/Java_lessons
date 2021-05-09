// однострочный коментарий
/*
многострочный комениапмй
 */

/**
 * @author Create by stuffing on 30.04.2021.
 * javadoc
 */

public class Kitchen {

    public static void main(String[] args) {
        System.out.println("main");
        cookSoup();
        cookBreakfast();
    }

    static void cookSoup() {
        // sout + tab
        // ctrl + d дублирование текущей строки
        System.out.println("Boil water");
        System.out.println("...");
        System.out.println("done");

    }

    static void cookBreakfast() {
        System.out.println("Breakfast done");
    }
}
