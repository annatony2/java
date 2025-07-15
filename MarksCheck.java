/*Author       : Anna Tony
  Date         : 16-05-2025
  Description  : mark check using if else*/
import java.util.Scanner;

public class MarksCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your marks (out of 100) : ");
        int marks=scanner.nextInt();

        if (marks>=90) {
            System.out.println("Excellent! You’ve scored an A+ ");
        }else if (marks>=75){
            System.out.println("Great job! You got an A ");
        }else if (marks>=60){
            System.out.println("Good effort! You scored a B ");
        }else if (marks>=40){
            System.out.println("You passed. Keep working hard!");
        }else{
            System.out.println("Don't give up! Try again and you'll improve.");
        }

        scanner.close();
    }
}
