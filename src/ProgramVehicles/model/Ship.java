package ProgramVehicles.model;

public class Ship extends CVehicle{
	private int port;

	public Ship(double price, double speed, int year, int port) {
		super(price, speed, year);
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Ship"+"\t"+"[port=" + port + ", price=" + price + ", speed=" + speed + ", year=" + year + "]";
	}
	
}
