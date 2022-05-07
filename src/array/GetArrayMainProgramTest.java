package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetArrayMainProgramTest {

    @Test
    void test_getArray_RandomArray_size(){
        Gettable service = new RandomWay();
        int[] array = service.getArray();
        assertEquals(10,array.length);
    }
    @Test
    void test_getArray_RandomArray_minBoarder(){
        Gettable service = new RandomWay();
        int[] array = service.getArray();
        for (int elem:array) {
            assertTrue(elem >= 0);
        }
    }
    @Test
    void test_getArray_RandomArray_maxBoarder(){
        Gettable service = new RandomWay();
        int[] array = service.getArray();
        for (int elem:array) {
            assertTrue(elem <= 20);
        }
    }

}