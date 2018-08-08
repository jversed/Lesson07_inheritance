package ProgramVehicles.model;

public class Plane extends CVehicle{
	double height;
	public Plane(double price, double speed, int year, double height, int passangers) {
		super(price, speed, year);
		this.height = height;
		this.passangers = passangers;
	}
	int passangers;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getPassangers() {
		return passangers;
	}
	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}
	@Override
	public String toString() {
		return "Plane"+"\t"+"[height=" + height + ", passangers=" + passangers + ", price=" + price + ", speed=" + speed
				+ ", year=" + year + "]";
	}
	
	
	
}
