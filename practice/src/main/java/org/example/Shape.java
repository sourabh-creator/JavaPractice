package org.example;

// Parent class
abstract class Shape {
    public abstract double area();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);       // Polymorphic reference
        Shape shape2 = new Rectangle(4, 6); // Polymorphic reference

        System.out.println("Circle area: " + shape1.area());
        System.out.println("Rectangle area: " + shape2.area());
    }
}
