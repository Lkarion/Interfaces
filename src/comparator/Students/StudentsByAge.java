package comparator.Students;

import java.util.Comparator;

public class StudentsByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.yearOfBirthday-o1.yearOfBirthday;
    }
}
