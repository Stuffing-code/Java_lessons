package basic2.java0.section1;

public class Dog {
    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String bread;
    private Size size = Size.UNDEFINED;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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
        switch (size) {
            case BIG, VERY_BIG -> System.out.println("Wof - wof");
            case AVERAGE -> System.out.println("Raf - raf");
            case SMALL, VERY_SMALL -> System.out.println("Taif - tiaf");
            default -> System.out.println("Dog's size is undefined");
        }

//        switch (size) {
//            case BIG:
//            case VERY_BIG:
//                System.out.println("Wof - wof");
//                break;
//            case AVERAGE:
//                System.out.println("Raf - raf");
//                break;
//            case SMALL:
//            case VERY_SMALL:
//                System.out.println("Taif - tiaf");
//                break;
//        }
//        if ("Big".equalsIgnoreCase(size)) {
//            System.out.println("Wof - wof");
//        } else if (size.equalsIgnoreCase("Average")) {
//            System.out.println("Raf - raf");
//        } else {
//            System.out.println("Tiaf - tiaf");
//        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
