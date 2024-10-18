/**
  Name: Vanessa Omeibe
*/
package org.howard.edu.lsp.assignment1;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // Constructor
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Method to check if two books are equal based on ISBN and author
    public boolean equals(Book otherBook) {
        return this.ISBN.equals(otherBook.getISBN()) && this.author.equals(otherBook.getAuthor());
    }

    // Method to return a simple string representation of a book
    public String printDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }

    public static void main(String[] args) {
        // Create book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Test the equals method
        System.out.println(book1.equals(book2)); // Output: true
        System.out.println(book1.equals(book3)); // Output: false

        // Test the printDetails method
        System.out.println(book1.printDetails());
    }
}