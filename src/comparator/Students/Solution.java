package comparator.Students;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {

        Comparator sortWay = SortWayService.getSortWay();

        Student s1 = new Student("Peter", 2000, 5.4);
        Student s2 = new Student("Ivan", 1999, 3.2);
        Student s3 = new Student("Maria", 2004, 2.5);
        Student s4 = new Student("Elena", 2003, 5.2);

        Student[] students = {s1,s2,s3,s4};

        Arrays.sort(students, sortWay);
        print(students);
    }

    public static void print(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
