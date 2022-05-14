package comparator.Observe;

import comparator.Students.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TasksSolutionTest {

    Student s1 = new Student("Peter", 2000, 5.4);
    Student s2 = new Student("Ivan", 1999, 3.2);
    Student s3 = new Student("Maria", 2004, 2.5);
    Student s4 = new Student("Elena", 2003, 5.2);

    Task task1 = new Task(123, s1);
    Task task2 = new Task(234, s2);
    Task task3 = new Task(333, s3);
    Task task4 = new Task(653, s4);

    Teacher t;
    List<Task> expList;

    @BeforeEach
    void init(){
        t = new Teacher();
        expList = new ArrayList<>();
    }

    @Test
    void test_add_Normal(){
        t.add(task1);
        expList.add(task1);
        assertEquals(expList, t.list);
    }

    @Test
    void test_add_NullTask(){
        t.add(null);
        assertEquals(expList, t.list);
    }

    @Test
    void test_remove_Normal(){
        t.add(task1);
        task1.setState(TaskState.DONE);
        t.remove(task1);
        assertEquals(expList, t.list);
    }

    @Test
    void test_remove_WithoutAdding(){
        t.remove(task1);
        assertEquals(expList, t.list);
    }

    @Test
    void test_add_againAfterRemove(){
        t.add(task1);
        task1.setState(TaskState.DONE);
        t.remove(task1);
        t.add(task1);
        expList.add(task1);
        assertEquals(expList, t.list);
    }

}