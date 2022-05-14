package comparator.Observe;

import comparator.Students.Student;

public class Task {
    private TaskState state;
    private int taskID;
    Student student;

    public Task(int taskID, Student student) {
        this.state = TaskState.ASSIGNED;
        this.taskID = taskID;
        this.student = student;
    }

    public String getState() {
        return String.valueOf(state);
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public int getTaskID() {
        return taskID;
    }
}
