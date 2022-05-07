package comparator.Students;

import java.util.Comparator;

public class StudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.gpa - o2.gpa > 0) return 1;
        else if (o1.gpa - o2.gpa < 0) return -1;
        else return 0;
    }
}
