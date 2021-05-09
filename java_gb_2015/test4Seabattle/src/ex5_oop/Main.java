package ex5_oop;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 10;
//        animal.about();

        Cat cat = new Cat();
        cat.name = "Tom";
        cat.home = "Home";
        cat.eye = "line";
//        cat.about();

        Dog dog = new Dog();
        dog.age = 4;
        dog.name = "Sharik";
//        dog.about();

        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = new Crocodile();
        animals[3] = new Lion();

        for (Animal animal1 : animals) { //Полиморфизм
            animal1.about();
        }
    }
}
