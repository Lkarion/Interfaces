package array;

import java.util.Scanner;

public class ScannerWay implements Gettable{
    @Override
    public int[] getArray() {
        Scanner sc = new Scanner(System.in).useDelimiter("\\ |\\n");
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }
}
