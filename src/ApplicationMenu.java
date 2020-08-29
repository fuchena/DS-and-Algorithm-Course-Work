import java.util.Scanner;

import book.Book;
import booklist.BookList;
import booklist.BookNode;
import bst.BinarySearchTree;
import bst.BinarySearchTreeTester;

/**  
*  this class test the implementation of methods 
*  in the Book,BookList and BinarySearchTree classes. 
*/ 
public class ApplicationMenu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("--------------------------------------------");
				System.out.println("Select from menu option");
				System.out.println("e.g Enter 1 for Building a Book class");
				System.out.println("1 - Building a Book class");
				System.out.println("2 - Building a Book List class");
				System.out.println("3 - Building a Binary Search Tree (BST) of Book data");
				System.out.println("4 - Quit Application");
				System.out.println("--------------------------------------------");
				int option = s.nextInt();
				switch (option) {
				case 1:
					Book book = new Book();
					book = storeBookInfo();
					System.out.println(book.toString());
					break;
				case 2:
					Book book1 = new Book();
					book1 = storeBookInfo();
					BookList list = new BookList();
					list.addBook(book1);
					BookNode bookNode = list.searchByAuthor("Lamin");
					if (bookNode != null) {
						System.out.println("Displaying Book(s) by Author...");
						bookNode.displayBook();
					} else {
						System.out.println("No Book Found !!!");
					}
					break;
				case 3:
					BinarySearchTreeTester load = new BinarySearchTreeTester();
					BinarySearchTree tree = load.loadData();

					System.out.println("Ascending Order.......");
					for (Object listLoad : tree.toList()) {
						System.out.println(listLoad);
					}

					System.out.println();

					System.out.println("Descending Order.......");
					for (Object listLoad : tree.toDesc(tree.toList())) {
						System.out.println(listLoad);
					}
					break;
				case 4:
					System.exit(0);;
				}
			}

		}

		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

	 /**  
     * returns a book with data about its properties,
     * captured from the console using the scanner class.  
     * @return A Book object.  
     */
	public static Book storeBookInfo() {
		Book book = new Book();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a book title:");
		String title = input.nextLine();
		System.out.println("Enter an Author's name:");
		String author = input.nextLine();
		System.out.println("Enter a book format:");
		String format = input.nextLine();
		System.out.println("Enter a book Genre:");
		String genre = input.nextLine();
		System.out.println("Enter an Isbn no:");
		String isbn = input.nextLine();
		System.out.println("Enter publication date:");
		String publicationDate = input.nextLine();
		System.out.println("Enter publisher name:");
		String publisher = input.nextLine();
		System.out.println("Enter a number of books borrowed:");
		int numberOfBorrows = input.nextInt();
		System.out.println("Enter No. of pages:");
		int numberOfPages = input.nextInt();
		book = new Book();

		book.setTitle(title);
		book.setAuthor(author);
		book.setFormat(format);
		book.setGenre(genre);
		book.setIsbn(isbn);
		book.setNumberOfBorrows(numberOfBorrows);
		book.setPublicationDate(publicationDate);
		book.setPublisher(publisher);
		book.setNumberOfPages(numberOfPages);
		return book;

	}
}
