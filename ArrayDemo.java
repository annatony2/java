/************************************************************
 * Author     : Anna Tony
 * Date       : 19-08-2025
 * Topic      : Abstraction in Java
 * Description: find the largest in array
 * Version    : 1.0
 ************************************************************/
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
	    int n = sc.nextInt();
	    int []array =new  int[n];
	    System.out.println("Enter the  elements : ");
	    for(int i=0;i<n;i++) {
	    	array[i]=sc.nextInt();
	    }
	    System.out.println("The given elements are : ");
	    for(int num:array) {
	    	System.out.println(num+"\t");
	    }
	    int largest=array[0];
	    for(int i=0;i<n;i++) {
	    	if(array[i]>largest) {
	    		largest=array[i];
	    	}
	    }
	    System.out.println("The largest element in array is "+largest);

	}

}
