package ex3_equals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
