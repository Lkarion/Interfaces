package comparator.Observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teacher implements Observable {

    List<Task> list = new ArrayList<>();

    @Override
    public void add(Task task) {
        if (task != null)
            list.add(task);
    }

    @Override
    public void remove(Task task) {
        if (task != null && list.contains(task))
            if (task.getState().equalsIgnoreCase(String.valueOf(TaskState.DONE))) {
                System.out.println("Task id" + task.getTaskID() + " is finished and is removed. Thank you, student " + task.student.getName());
                list.remove(task);
            }
    }

    /*public void removeAll() {
       list.forEach(task -> {
           if (task.getState().equalsIgnoreCase(String.valueOf(TaskState.DONE))) {
                System.out.println("Task id" + task.getTaskID() + " is finished and is removed. Thank you, student " + task.student.getName());
                list.remove(task);
            }
        });
    }*/

    @Override
    public void notifyStudents() {
        list.forEach(task -> task.student.handleTask(task));
    }
}
