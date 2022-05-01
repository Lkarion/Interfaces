package array;

import java.util.Random;

public class RandomWay implements Gettable{
    @Override
    public int[] getArray() {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }
}
