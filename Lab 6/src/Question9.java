/*
*Godiraone
*18001321
*Lab 6
 */

// Parent class
class Person {

    // First method
    public void greet() {
        System.out.println("Hello!");
    }

    // Overloaded method (same name, different parameter list)
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Child class
class Student extends Person {

    // Overridden method (same signature as parent)
    @Override
    public void greet() {
        System.out.println("Hello! I am a student.");
    }
}

public class Question9 {

    public static void main(String[] args) {

        // Create Person object
        Person person = new Person();

        // Demonstrates overloading
        person.greet();
        person.greet("Godiraone");

        System.out.println();

        // Create Student object
        Student student = new Student();

        // Demonstrates overriding
        student.greet();

        // Inherited overloaded method
        student.greet("Godiraone");
    }
}