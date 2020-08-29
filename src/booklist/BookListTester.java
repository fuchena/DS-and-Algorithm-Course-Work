package booklist;

import book.Book;

/**  
*  class test the implementation of the methods 
*  in the BookList and BookNode classes. 
*/ 
public class BookListTester {

    public static void main(String[] args){
try {
        Book book = new Book();
        book.setTitle("Programming");
        book.setAuthor("Ousainou");
        book.setFormat("PDF");
        book.setGenre("Education");
        book.setIsbn("4309443");
        book.setNumberOfBorrows(10);
        book.setPublicationDate("20-06-2018");
        book.setPublisher("Test");

        Book book1 = new Book();
        book1.setTitle("Databases");
        book1.setAuthor("Ousman");
        book1.setFormat("PDF");
        book1.setGenre("Education");
        book1.setIsbn("43094431");
        book1.setNumberOfBorrows(101);
        book1.setPublicationDate("19-12-2017");
        book1.setPublisher("Test1");

        Book book2 = new Book();
        book2.setTitle("Networking");
        book2.setAuthor("Lamin");
        book2.setFormat("EBOOK");
        book2.setGenre("Education");
        book2.setIsbn("43094431");
        book2.setNumberOfBorrows(10);
        book2.setPublicationDate("19-12-2018");
        book2.setPublisher("Test2");
        
        Book book3 = new Book();
        book3.setTitle("Security");
        book3.setAuthor("Fatou");
        book3.setFormat("EBOOK");
        book3.setGenre("Education");
        book3.setIsbn("43988");
        book3.setNumberOfBorrows(10);
        book3.setPublicationDate("19-12-2019");
        book3.setPublisher("Test3");
        
        
        Book book4 = new Book();
        book4.setTitle("Discrete Maths");
        book4.setAuthor("Anthony");
        book4.setFormat("EBOOK");
        book4.setGenre("Education");
        book4.setIsbn("4309222");
        book4.setNumberOfBorrows(10);
        book4.setPublicationDate("19-12-2020");
        book4.setPublisher("Test4");

        BookList list = new BookList();

        list.addBook(book);
        list.addBook(book1);
        list.addBook(book2);

        BookNode bookNode = list.searchByAuthor("Lamin");
        if (bookNode != null){
            System.out.println("Displaying Book(s) by Author...");
            bookNode.displayBook();
        }else {
            System.out.println("No Book Found !!!");
        }
    }
    catch (Exception ex) {
		System.out.println("Error: " + ex.getMessage());
	}
}
}
