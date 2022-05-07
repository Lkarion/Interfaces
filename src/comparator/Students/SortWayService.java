package comparator.Students;

import java.util.Comparator;
import java.util.Scanner;

public class SortWayService {

    public static Comparator<Student> getSortWay(){
        Scanner sc = new Scanner(System.in);
        int sortWay;
        do {
            System.out.println("Choose a way of sorting (type a number):");
            System.out.println("1. by name");
            System.out.println("2. by age");
            System.out.println("3. by GPA");
            sortWay = sc.nextInt();
        }
        while(sortWay != 1 && sortWay != 2 && sortWay != 3);

        sc.close();

        switch (sortWay){
            case 1: return new StudentsByName();
            case 2: return new StudentsByAge();
            case 3: return new StudentsByGPA();
        }
        return new StudentsByName();
    }
}
