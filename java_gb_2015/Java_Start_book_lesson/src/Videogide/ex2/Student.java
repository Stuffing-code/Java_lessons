package Videogide.ex2;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;

    // avr grade  max 10
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreIngLanguageAverageGrade;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Andrey";
        st1.surname = "Ivanov";
        st1.course = 2;
        st1.mathAverageGrade = 5.4;
        st1.economicsAverageGrade = 7.2;
        st1.foreIngLanguageAverageGrade = 9.2d;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Sergei";
        st2.surname = "Popov";
        st2.course = 1;
        st2.mathAverageGrade = 9.5D;
        st2.economicsAverageGrade = 1.9;
        st2.foreIngLanguageAverageGrade = 7.4;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Alina";
        st3.surname = "Petrova";
        st3.course = 5;
        st3.mathAverageGrade = 8.4;
        st3.economicsAverageGrade = 4.3;
        st3.foreIngLanguageAverageGrade = 10.0d;

        double resultSt1 = (st1.mathAverageGrade + st1.economicsAverageGrade + st1.foreIngLanguageAverageGrade) / 3;

        double resultSt2 = (st2.mathAverageGrade + st2.economicsAverageGrade + st2.foreIngLanguageAverageGrade) / 3;
        double resultSt3 = (st3.mathAverageGrade + st3.economicsAverageGrade + st3.foreIngLanguageAverageGrade) / 3;


        System.out.println(
                "Средняя арифметическая оценка студента " + st1.name + " = " + resultSt1);
        System.out.println(
                "Средняя арифметическая оценка студента " + st2.name + " = " + resultSt2);
        System.out.println(
                "Средняя арифметическая оценка студента " + st3.name + " = " + resultSt3);

    }
}
