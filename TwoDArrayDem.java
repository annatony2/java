import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of row : ");
	    int row= sc.nextInt();
	    System.out.println("Enter the number of col : ");
	    int col= sc.nextInt();
	    int [][]array =new  int[row][col];
	    System.out.println("Enter the  elements : ");
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) 
	    		array[i][j]=sc.nextInt();
	    }
	    int [][]transpose =new  int[row][col];
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) 
	    		transpose[j][1]=array[i][j];
	    }
	    System.out.println("The  elements are : ");
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) 
	    		System.out.println(transpose[i][j]+"\t");
	    }

	}

}
