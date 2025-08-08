

class Vehicle{
	String brand;
	String model;
	
	Vehicle(String brand, String model){
		this.brand =brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Fuel Type  : "+fuelType);
		
	}
}
class ECar extends Car{
	
	double batteryCapacity;
	ECar(String brand,String model,String fuelType,double batteryCapacity){
		
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
		
	}
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Battery Capacity: "+batteryCapacity);
		
	}
}
public class VehicleMain {

	public static void main(String[] args) {
		ECar car1= new ECar("A","H","C",433.0);
		car1.displayInfo();
		

	}

}
