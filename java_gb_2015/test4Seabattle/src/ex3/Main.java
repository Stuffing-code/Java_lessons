package ex3;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
//        Cat cat2 = new Cat("Myrka", 2);
//        System.out.println(Cat.catsAmount);
        cat1.staticShowCatsAmount();
        Cat.staticShowCatsAmount();
    }
}
