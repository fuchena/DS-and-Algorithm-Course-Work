package book;

/**  
* this class implements Comparable interface to create a Book
*/ 
public class Book implements Comparable<Book> {

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;
    private String publicationDate;
    private String format;
    private String genre;
    private int numberOfBorrows;



    /**  
     * Retrieve a book isbn value.  
     * @return A String data type.  
     */ 
    public String getIsbn() {
        return isbn;
    }

    /**  
     * Set a book isbn value.   
     * @param isbn A variable of type String.
     */ 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**  
     * Retrieve a book title value.  
     * @return A String data type.  
     */ 
    public String getTitle() {
        return title;
    }
    
    /**  
     * Set a book title value.   
     * @param title A variable of type String.
     */ 
    public void setTitle(String title) {
        this.title = title;
    }

    /**  
     * Retrieve a book author value.  
     * @return A String data type.  
     */ 
    public String getAuthor() {
        return author;
    }

    /**  
     * Set a book author value.    
     * @param author A variable of type String.
     */ 
    public void setAuthor(String author) {
        this.author = author;
    }

    /**  
     * Retrieve a book publisher value.  
     * @return A String data type.  
     */ 
    public String getPublisher() {
        return publisher;
    }

    /**  
     * Set a book publisher value.    
     * @param publisher A variable of type String.
     */ 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**  
     * Retrieve a book Number of pages value.  
     * @return A String data type.  
     */ 
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**  
     * Set a book Number of pages value.    
     * @param numberOfPages A variable of type int.
     */ 
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**  
     * Retrieve a book publication date value.  
     * @return A String data type.  
     */ 
    public String getPublicationDate() {
        return publicationDate;
    }

    /**  
     * Set a book publication date value.    
     * @param publicationDate A variable of type String.
     */ 
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**  
     * retrieve a book format value.  
     * @return A String data type.  
     */ 
    public String getFormat() {
        return format;
    }

    /**  
     * Set a book format value.    
     * @param format A variable of type String.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**  
     * Retrieve a book genre value.  
     * @return A String data type.  
     */ 
    public String getGenre() {
        return genre;
    }

    /**  
     * Set a book genre value.    
     * @param genre A variable of type String.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**  
     * Retrieve a book number of borrows value.  
     * @return An int data type.  
     */ 
    public int getNumberOfBorrows() {
        return numberOfBorrows;
    }


    /**  
     * Set a book number of borrows value.    
     * @param numberOfBorrows A variable of type int.
     */
    public void setNumberOfBorrows(int numberOfBorrows) {
        this.numberOfBorrows = numberOfBorrows;
    }

    @Override
    /**  
     * compares books by author name for sorting.  
     * @return An int data type.  
     */ 
    public int compareTo(Book book) {
        if (this.getAuthor().compareTo(book.getAuthor()) < 0){
            return -1;
        }else if (this.getAuthor().compareTo(this.getAuthor()) > 0){
            return 1;
        }else{
            return 0;
        }
    }

    /**  
     * creates a toString method for a Book object  
     * @return A String data type.  
     */
    public String toString(){
        return " Book Details ##### \n" + " Book Isbn :" + getIsbn() + " \n" + " Book Title :" + getTitle() + "\n" +
                " Book Author :" + getAuthor() + "\n" + " Book Publisher : " + getPublisher() + "\n Book Number of Pages :" +
                getNumberOfPages() + "\n Book Publication Date : " + getPublicationDate() + "\n" + " Book Format : " +
                getFormat() + "\n" + " Book Genre : " + getGenre() + " \n" + " Book Number of Borrows : " + getNumberOfBorrows() + "\n";
    }

}
