package ex1;

public class Main3 {
    public static void main(String[] args) {
        new Cat(3, "Tom", false);
        Cat cat1 = new Cat(3, "Tom", true);
        Cat cat2 = new Cat(2, "Myrka", false);

        cat1.about();
        Cat tempCat = cat1;
        cat1 = cat2;

        cat1.about();
        tempCat.about();

    }
}
