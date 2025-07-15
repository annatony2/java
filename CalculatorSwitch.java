/* 
  Author       : Anna Tony
  Date         : 16-05-2025
  Description  : Simple calculator using switch-case
*/

import java.util.Scanner;

public class CalculatorSwitch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.println("Choose operation(+,-,*,/) : ");
        char operator=sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Result = "+(num1+num2));
                break;
            case '-':
                System.out.println("Result = "+(num1-num2));
                break;
            case '*':
                System.out.println("Result = "+(num1*num2));
                break;
            case '/':
                System.out.println("Result = "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
        sc.close();
    }
}
