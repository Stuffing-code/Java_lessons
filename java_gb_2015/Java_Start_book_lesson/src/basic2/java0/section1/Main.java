package basic2.java0.section1;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setBread("Lab");
        lab.setName("Charly");
        lab.setSize("Average");
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBread("Sheppard");
        sheppard.setSize("Big");
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jack");
        doberman.setBread("Doberman");
        doberman.setSize("Big");
        doberman.bite();
    }
}
