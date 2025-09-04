package org.example;

// Parent class
class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Car subclass
class Car1 extends Vehicle {
    public Car1(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is driving on the road");
    }
}

// Bike subclass
class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is riding on the street");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car1("Toyota");
        Vehicle v2 = new Bike("Yamaha");

        v1.move(); // Runtime polymorphism
        v2.move(); // Runtime polymorphism
    }
}
