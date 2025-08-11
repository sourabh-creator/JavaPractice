package org.example;

public class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The power of sub conscious mind", "Harper Lee");

        book1.displayInfo();
        book2.displayInfo();
    }
}
