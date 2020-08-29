package booklist;

import book.Book;

/**
 * Interface with list of methods to use in the BookList class
 **/
public interface IADbookList {
	/**  
     * adds a new Book to the list.  
     * @param book A variable of type Book.  
     */ 
	public void addBook(Book book);

	/**  
     * searches for a book based on Author.  
     * @param author A variable of type String.
     * @return A BookNode object from the BookNode class.    
     */ 
	public BookNode searchByAuthor(String author);
	
	/**  
     * searches for a book based on Title.  
     * @param title A variable of type String.
     * @return A BookNode object from the BookNode class.    
     */
	public BookNode searchByTitle(String title);
	
	 /**  
     * display a list of books based on Genre.  
     * @param genre A variable of type String.   
     */ 
	public void displayBooksByGenre(String genre);
	
	/**  
     * displays all books stored.     
     */
	public void displayAllBooks();
	
}
