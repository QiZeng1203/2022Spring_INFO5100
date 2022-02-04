package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book1 = new Book();
        Book book2 = new Book("Friends", 001, "comedy", 3.00d);

        book2.setName("NewName");
        printBookInfo(book1);
        printBookInfo(book2);
    }

    private static void printBookInfo(Book book) {
        System.out.println("*********");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Book ID: " + book.getBookID());
        System.out.println("Book Genre: " + book.getGenres());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("*********");
    }
}