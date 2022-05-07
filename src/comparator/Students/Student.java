package comparator.Students;

public class Student {
    //Create new class Students with following fields (String name, int yearOfBirthday, double gpa).
    // Create the array of several students. Your program should ask user how to sort students
    // (by name, by age, or by gpa) and display students accordingly
    String name;
    int yearOfBirthday;
    double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + ' ' + yearOfBirthday + ", " + gpa;
    }

}
