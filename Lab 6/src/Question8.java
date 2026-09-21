/*
*Godiraone
*18001321
*Lab 6
 */

// Parent class
class Animal {

    // Method that can be overridden
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Cat extends Animal {

    // Override speak() from Animal class
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class Question8 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.speak();

        Cat c = new Cat();
        c.speak();
    }
}