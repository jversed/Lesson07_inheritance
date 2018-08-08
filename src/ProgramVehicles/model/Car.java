package ProgramVehicles.model;

public class Car extends CVehicle {

	public Car(double price, double speed, int year) {
		super(price, speed, year);
	}
	public void Movecar() {
		System.out.println("moving......");
	}

	@Override
	public String toString() {
		return "Car"+"\t"+"[price=" + price + ", speed=" + speed + ", year=" + year + "]";
	}
	
	
}
