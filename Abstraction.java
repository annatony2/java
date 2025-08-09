/************************************************************
 * Author     : Anna Tony
 * Date       : 09-08-2025
 * Topic      : Abstraction in Java
 * Description: Program to calculate area of shapes (Circle &
 *              Rectangle) using an abstract class Shape with
 *              abstract method calculateArea().
 * Version    : 1.0
 ************************************************************/

abstract class Shape{
	abstract double calculateArea();
}

class Circle extends Shape{
	double radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	
	double calculateArea() {
		return length*width;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Shape circle=new Circle(2);
		Shape rectangle=new Rectangle(4,8);
		System.out.println("Area of Circle: " +circle.calculateArea());
        System.out.println("Area of Rectangle: " +rectangle.calculateArea());
	}

}
