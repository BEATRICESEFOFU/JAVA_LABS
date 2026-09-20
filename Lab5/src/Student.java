/*
*Godiraone Sefofu
*18001321
*lab5
 */

//Student class with private fields, a constructor, and a getter for each field
public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student("Beatrice Sefofu", 26, 4.50 );
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
    }
}
