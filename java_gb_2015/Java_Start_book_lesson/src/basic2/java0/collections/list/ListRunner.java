package basic2.java0.collections.list;

import java.util.Arrays;
import java.util.Scanner;

public class ListRunner {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1 -> {
                    System.out.println("Please enter a task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToDOlist(task1);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                case 2 -> {
                    System.out.println("Printing out TO DO LIST");
                    list.printToDoList();
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                case 3 -> {
                    System.out.println("Please enter an item to update");
                    scanner.nextLine();
                    int i = scanner.nextInt();// mb exception
                    System.out.println("Please enter a new task");
                    scanner.nextLine();
                    String task2 = scanner.nextLine();
                    list.changeTask(i, task2);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                case 4 -> {
                    System.out.println("Please task to remove");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.removeTask(task3);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                case 5 -> {
                    System.out.println("Please enter a task to get priority");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    System.out.println("Priority of the task is" + list.getTaskPriority(task4));
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                case 6 -> {
                    System.out.println("Please enter a number of position for the task");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    list.changeTask(index, task5);
                    System.out.println("Please choose an action by typing [0 - 6]");
                    param = scanner.nextInt();
                }
                default -> param = 0;
            }
        }
    }

    private static void printOut() {
        System.out.println("""
                Please choose an action. Press :
                1 to add new item into ToDoList
                2 to print out the list\s
                3 to update an existing item\s
                4 to remove an item form the list\s
                5 to get task priority or number in the list\s
                6 to add a new item at specific position\s
                press - for exit\s

                AFTER CHOOSING AN OPTION PLEASE PRESS ENTER\s
                """
        );
    }
}
