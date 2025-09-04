package org.example;
public class Student {
    String name;
    int age;
    String grade;
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayStudent() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "A");
        Student s2 = new Student("Bob", 22, "B");

        s1.displayStudent();
        s2.displayStudent();
    }
}
