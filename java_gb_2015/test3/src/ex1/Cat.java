package ex1;

public class Cat {
    // характеристики (состояние)б свойства, поля
    int age;
    String name;
    double weight;
    boolean isMale;
    Tail tail; // композиция
    Talisman talisman; // агрегация

    // методы (поведение)
    void voice() {
        System.out.println("may");
    }

    void sleep() {
        System.out.println("hrrrrr");
    }

    void about() {
        String s = "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isMale=" + isMale +
                ", tail=" + tail +
                ", talisman=" + talisman +
                '}';
        System.out.println(s);
    }

    Cat() {

    }

    public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}
