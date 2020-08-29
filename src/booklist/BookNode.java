package booklist;


import java.util.List;

import book.Book;

/**  
*  BookNode class. Every BookNode contains a book and reference 
*  the next BookNode.
*/
public class BookNode {
    public BookNode next;
    public Book book;


    /**
	 * Constructs a BookNode with a given Book.
	 * 
	 * @param book an object reference to the Book class
	 */
    public BookNode(Book book) {
        this.book = book;
    }

    /**  
     * displays all books stored.     
     */
    public void displayBook() {
        System.out.println(this.book.toString());
    }
}
