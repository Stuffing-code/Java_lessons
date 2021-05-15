package basic.section2;

import java.util.SortedMap;

public class SwapVariables {
    public static void main(String[] args) {
        var a = 0;
        var b = 543;

        var c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
