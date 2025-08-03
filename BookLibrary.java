/************************************************************
 * Author       : Anna Tony
 * Date         : 03-August-2025
 * Description  : This program manages book details using a Book class.
 *                It assigns a unique ID to each book, keeps track of
 *                total books, and displays book info.
 * Version      : 1.0
 ************************************************************/

class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central library";
	
	Book(){
		this.title="Unknown";
		this.author="Unknown";
		bookCounter++;
		bookID=bookCounter;
	}
	
	Book(String title,String author){
		this.title=title;
		this.author=author;
		bookCounter++;
		bookID=bookCounter;
	}
	
	public void displayInfo() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Book ID : "+bookID);
	}
	
	public void displayInfo(boolean showLibrary) {
		if(showLibrary==true) {
			System.out.println("Library name : "+LIBRARY_NAME);
		}
	}
	
	public static void displayTotalbooks() {
		int totalBook=bookCounter-1000;
		System.out.println("Total Book : "+totalBook);
	}
}

public class BookLibrary {
	public static void main(String[]args) {
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		Book book4=new Book("ABC","abc");
		Book book5=new Book("DEF","def");
		Book book6=new Book("GHI","ghi");
		
		book1.displayInfo();
		System.out.println("===================");
		book2.displayInfo();
		System.out.println("===================");
		book3.displayInfo();
		System.out.println("===================");
		book4.displayInfo();
		System.out.println("===================");
		book5.displayInfo();
		System.out.println("===================");
		book6.displayInfo();
		System.out.println("===================");
		
		Book.displayTotalbooks();
	}
}
