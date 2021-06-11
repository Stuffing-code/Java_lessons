package basic2.java0.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> toDoList = new ArrayList<>();

    public void addToDOlist(String task) {
        toDoList.add(task);
    }

    public void addtoListatPosition(int position, String task) {
        toDoList.add(position, task);
    }

    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

    public void changeTask(int position, String task) {
        toDoList.set(position, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }
}
