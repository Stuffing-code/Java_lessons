package ex3;

public class Cat {
    String name;
    int age;
    static int catsAmount;

    static { // блок инициализации
//        age = 20;
        catsAmount = 100;
    }

    { // блок инициализации
        age = 20;
        catsAmount = 100;
    }

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        catsAmount++;
    }

    void about() {
        System.out.println(name);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }

    static void staticShowCatsAmount() {
        System.out.println(catsAmount);
    }


}
