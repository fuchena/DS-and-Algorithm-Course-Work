Data Structures and Algorithm - Book-Application Test Regime
Note: To test the Book Application please run with Eclipse, IntelliJ or any other IDE
compatible with java.

Below I list each class and how to go about testing it:
1. Book Tester class: This class test the implementation of methods in the Book Class.
To Test it simply open in IDE and run it. Two book objects have been created in this
class with respective data by making use of the setters methods for the available
properties such as ISBN, Title, Author, Publisher, Number of Pages, Publication Date,
Format, Genre and Number of borrows. A toString method is created in the Book
class that calls and prints all the data available in the getter methods of these books.

2. BookList Tester class: This class test the implementation of the methods in the
BookList and BookNode classes. We created 5 Books in this class with respective
data using the available setter methods in the Book class. We also instantiate the
BookList class to add all 5 Books into the BookList LinkedList. The constructor of
the BookList class allows us to create a Book as a BookNote. So every Book is a 
BookNode that has reference to the next BookNode. This is seen in the BookNode
class.

3. Binary Search Tree Tester class: This class test the implementation of methods in
the Binary Search Tree class. It loads data from BooksData.txt which contains data of
Books and their properties. This data is loaded using the LoadData method and then I
read through it using File reader to load the data in memory and created methods to
sort data in ascending or descending order by author name.

4. Application Menu class: This class test the implementation of methods in the Book,
BookList and BinarySearchTree classes. It allows the user to select a menu option to
test any one of the Tester class implementation of these classes. So the user gets to
select from the console an option from 1 to 4 and has the choice to repeat the process
again. Option 4 allows the user to quit the application.

5. Lastly, the Javadoc is located in the "doc" folder. To view it, simply click on the
index page.
