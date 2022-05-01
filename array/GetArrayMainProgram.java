package array;

import java.util.Arrays;

public class GetArrayMainProgram {
    public static void main(String[] args) {
        Gettable way1 = new DefinedWay();
        System.out.println(Arrays.toString(getArray(way1)));
        Gettable way2 = new ScannerWay();
        System.out.println(Arrays.toString(getArray(way2)));
        Gettable way3 = new RandomWay();
        System.out.println(Arrays.toString(getArray(way3)));

    }
    public static int[] getArray(Gettable way){
        return way.getArray();
    }
}
