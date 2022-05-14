package comparator.Students;

import comparator.Observe.Observer;
import comparator.Observe.Task;
import comparator.Observe.TaskState;

public class Student implements Observer {
    //Create new class Students with following fields (String name, int yearOfBirthday, double gpa).
    // Create the array of several students. Your program should ask user how to sort students
    // (by name, by age, or by gpa) and display students accordingly
    String name;
    int yearOfBirthday;
    double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ' ' + yearOfBirthday + ", " + gpa;
    }


    @Override
    public void handleTask(Task task) {
        System.out.println("Student " + name + " got Task id" + task.getTaskID());
        task.setState(TaskState.IN_PROCESS);
        task.setState(TaskState.DONE);
    }
}
