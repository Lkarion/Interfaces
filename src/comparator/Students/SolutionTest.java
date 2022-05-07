package comparator.Students;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Student s1 = new Student("Peter", 2000, 5.4);
    Student s2 = new Student("Ivan", 1999, 3.2);
    Student s3 = new Student("Maria", 2004, 2.5);

    Student[] students = {s1,s2,s3};

    @Test
    void test_sort_byName(){
        Arrays.sort(students, new StudentsByName());
        assertArrayEquals(new Student[]{s2,s3,s1}, students);
    }
    @Test
    void test_sort_byAge(){
        Arrays.sort(students, new StudentsByAge());
        assertArrayEquals(new Student[]{s3,s1,s2}, students);
    }
    @Test
    void test_sort_byGPA(){
        Arrays.sort(students, new StudentsByGPA());
        assertArrayEquals(new Student[]{s3,s2,s1}, students);
    }
}