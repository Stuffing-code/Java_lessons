package basic2.java0.section1;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String bread;
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Correct size dog: Big, Average or Small");
        }
    }

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof - wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf - raf");
        } else {
            System.out.println("Tiaf - tiaf");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
