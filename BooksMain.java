/************************************************************
 * Author       : Anna Tony
 * Date         : 08-August-2025
 * Description  : This program demonstrates inheritance and 
 *                method overriding by managing details of 
 *                different types of books - Ebooks and 
 *                Printed Books. It stores title, author, 
 *                price, and additional attributes such as 
 *                file size for Ebooks and number of pages 
 *                for Printed Books. The program displays 
 *                complete information for each book object.
 * Version      : 1.0
 ************************************************************/

class Book{
	String title;
	String author;
	double price;
	

	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displayInfo() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Book Price : "+price);
	}
}
class Ebook extends Book{
	
	double fileSizeMB=0;
	
	Ebook(String title,String author,double price,double fileSizeMB){
		
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
		
	}
	
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("File size  : "+fileSizeMB);
		
	}
}
class PrintedBook extends Book{
	
	double noOfPages=0;
	
	PrintedBook(String title,String author,double price,int noOfPages){
		
		super(title,author,price);
		
		this.noOfPages=noOfPages;
		
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("NO of page : "+noOfPages);
		
	}
}
public class BooksMain {

	public static void main(String[] args) {
		Ebook book1= new Ebook("A Good Girl's Guide to Murder ","Holly Jackson",399.0,433.0);
		book1.displayInfo();
		System.out.println("------------------------------------");
		Ebook book2= new Ebook("The Silent Patient","Alex Michaelides",359.0,466.0);
		book1.displayInfo();
		System.out.println("-------------------------------------");
		PrintedBook book3= new PrintedBook("Atomic Habits","James Clear",550.0,320);
		book3.displayInfo();
		System.out.println("-------------------------------------");
		PrintedBook book4= new PrintedBook("One of us is next ","Kare M. McManus",350.0,384);
		book4.displayInfo();
		System.out.println("-------------------------------------");
	}

}
