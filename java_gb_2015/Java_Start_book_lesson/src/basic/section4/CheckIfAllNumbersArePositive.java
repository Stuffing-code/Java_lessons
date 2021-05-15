package basic.section4;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 5, -6, 7, 8, 9};

        boolean flag = true;
        for (int element : array) {
            if (0 > element) {
                flag = false;
                break;
            }
        }

//        if (!flag) {
//            System.out.println("Not all positive");
//        } else {
//            System.out.println("All positive");
//        }
        System.out.println(flag ? "All positive" : "Not all positive");
    }
}
