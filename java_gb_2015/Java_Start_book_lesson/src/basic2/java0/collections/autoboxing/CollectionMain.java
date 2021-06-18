package basic2.java0.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add("1");

        String[] colors = {"yellow", "green", "blue"};
        LinkedList<String> li = new LinkedList<>(Arrays.asList(colors));
        li.add("black");

        colors = li.toArray(new String[li.size()]);

        for (int i = 0; i < colors.length; i++) {
            System.out.println();
        }
    }
}
