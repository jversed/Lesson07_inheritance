package ProgramVehicles.model;
public class CVehicle {
	double price;
	double speed;
	int year;
	public CVehicle(double price, double speed, int year) {
		super();
		this.price = price;
		this.speed = speed;
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "CVehicle"+"\t"+"[price=" + price + ", speed=" + speed + ", year=" + year + "]";
	}
	public void year2000plus() {
		if(year>2000) {
			System.out.println(toString());
		}
	}
	
}