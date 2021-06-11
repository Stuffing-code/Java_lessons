package basic2.java0.collections.arrays;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradeArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        System.out.println("Minimal grade " + calcMin(gradeArray));
    }


    private static int calcMin(int[][] grades) {
        int min = 100;
        for (int[] row :
                grades) {
            for (int i :
                    row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }
}
