package org.example;
public class Car {
    String color;
    String model;
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public void start() {
        System.out.println(model + " in " + color + " color is starting...");
    }

    public void stop() {
        System.out.println(model + " is stopping...");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota");
        Car car2 = new Car("Blue", "Honda");

        car1.start();
        car1.stop();

        car2.start();
        car2.stop();
    }
}
