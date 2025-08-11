package org.example;

// Interface
interface Shape1 {
    double area();
    double perimeter();
}
// Rectangle class
class Rectangle1 implements Shape1 {
    private double length;
    private double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Circle class
class Circle1 implements Shape1 {
    private double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

// Main class to test
public class MainShape {
    public static void main(String[] args) {
        Shape1 rect = new Rectangle1(5, 3);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        Shape1 circle = new Circle1(4);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}
