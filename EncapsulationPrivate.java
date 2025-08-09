class Student{
	private String name;
	private int rollNumber;
	private int[] marks=new int [3];
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setMarks(int i,int marks) {
		this.marks[i]=marks;
	}
	
	public int getMarks(int i) {
		return marks[i];
	}
	
	public double calculateAvg() {
		int total=0;
		for (int i=0;i<marks.length;i++) {
			total+=marks[i];
		}
		return total/3.0;
	}
}
public class EncapsulationPrivate {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Anna Tony");
		s1.setRollNumber(24);
		s1.setMarks(0,55);
		s1.setMarks(1,42);
		s1.setMarks(2,52);
		System.out.println("Name : "+s1.getName());
		System.out.println("Roll Number : "+s1.getRollNumber());
		System.out.println("Average Mark :"+s1.calculateAvg());
	}

}
