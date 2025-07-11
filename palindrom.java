/*Author       : Anna Tony
  Date         : 11-05-2025
  Description  : Check the given number is palindrom or not */
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
      
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number : ");
		  int inputNumber=sc.nextInt();
		  int rev=0,reminder=0;
		  int copyNumber=inputNumber;
    while(copyNumber>0){
        reminder=copyNumber%10;
        rev=(rev*10)+reminder;
        copyNumber=copyNumber/10;
    }
    if(rev==inputNumber){
    	System.out.println(inputNumber +" is a palindrom !");
    }else{
    	System.out.println(inputNumber +" not a palindrom ! It's reverse is "+rev);
    } 
	}
}
