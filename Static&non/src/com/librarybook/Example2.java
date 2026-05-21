package com.librarybook;

class Book {
    static String libraryName;
    String title;
    String author;

    void displayInfo() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("-------------------------");
    }
}

public class Example2 {

	public static void main(String[] args) {
		Book.libraryName = "City Public Library";

        Book b1 = new Book();
        b1.title = "The Great Gatsby";
        b1.author = "F. Scott Fitzgerald";

        Book b2 = new Book();
        b2.title = "1984";
        b2.author = "George Orwell";

        b1.displayInfo();
        b2.displayInfo();
	}

}
