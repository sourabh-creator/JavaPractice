package org.example;

// Parent class
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for " + name);
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Constructor chaining
        System.out.println("Dog constructor called for " + name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
    }
}
