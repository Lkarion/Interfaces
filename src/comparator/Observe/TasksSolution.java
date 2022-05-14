package comparator.Observe;

import comparator.Students.Student;

public class TasksSolution {
    public static void main(String[] args) {
        Student s1 = new Student("Peter", 2000, 5.4);
        Student s2 = new Student("Ivan", 1999, 3.2);
        Student s3 = new Student("Maria", 2004, 2.5);
        Student s4 = new Student("Elena", 2003, 5.2);

        Task task1 = new Task(123, s1);

        Teacher t = new Teacher();
        t.add(task1);
        t.add(new Task(234, s2));
        t.add(new Task(333, s3));
        t.add(new Task(653, s4));
        t.notifyStudents();

        t.remove(task1);

    }
}
