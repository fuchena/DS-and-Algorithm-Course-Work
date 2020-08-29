package booklist;
import java.util.List;

import book.Book;
/**  
*  this class implements IADbookList interface for storing a 
*  list of books
*/ 
public class BookList implements IADbookList{

    private BookNode first;

    /**
	 * the first item in the BookList of type BookNode 
	 * initialized to null in constructor.
	 */
    public BookList() {
        this.first = null;
    }

    /**  
     * adds a new Book to the list.  
     * @param book A variable of type Book.  
     */ 
    public void addBook(Book book) {
        BookNode bookNode = new BookNode(book);
        bookNode.next = first;
        first = bookNode;
    }

    /**  
     * searches for a book based on Author.  
     * @param author A variable of type String.
     * @return A BookNode object from the BookNode class.    
     */ 
    public BookNode searchByAuthor(String author) {
        BookNode current = first;
        while (current.book.getAuthor() != author) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    /**  
     * searches for a book based on Title.  
     * @param title A variable of type String.
     * @return A BookNode object from the BookNode class.    
     */ 
    public BookNode searchByTitle(String title) {
        BookNode current = first;
        while (current.book.getTitle() != title) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }
    
    /**  
     * display a list of books based on Genre.  
     * @param genre A variable of type String.   
     */ 
    public void displayBooksByGenre(String genre) {
        System.out.println("Displaying All The Books Genre .....");
        BookNode current = first;
        while (current != null) {
            if (current.book.getGenre().equalsIgnoreCase(genre)) {
                current.displayBook();
                current = current.next;
            }
        }
        System.out.println("");
    }

    /**  
     * displays all books stored.     
     */
    public void displayAllBooks() {
        System.out.println("Displaying All The Books.....");
        BookNode current = first;
        while (current != null) {
            current.displayBook();
            current = current.next;
        }
        System.out.println("");
    }

}
