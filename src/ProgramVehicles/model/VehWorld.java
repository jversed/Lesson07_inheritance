package ProgramVehicles.model;

import java.util.Arrays;

public class VehWorld {
		CVehicle [] vehicleWorld;
		
		public VehWorld(int count) {
			vehicleWorld = new CVehicle[count];
		}
		public VehWorld() {
			vehicleWorld = new CVehicle[3];
		}
		
		public void generateVehicleForVehWorld() {
			vehicleWorld[0]=new Car(1.2, 13, 2007);
			vehicleWorld[1]=new Plane (10, 400.0, 2003, 25, 10);
			vehicleWorld[2]=new Ship (23, 100.0, 1992, 5);
		}
		public void after2000() {
		System.out.println("Vehicles after 2000: ");
			for (int i = 0; i < vehicleWorld.length; i++) {
			//System.out.println(VehWorld[i]);
			vehicleWorld[i].year2000plus();
			}
		}
		public void maxSpeed() {
			double maxSpeed=0;
			for (int k = 0; k < vehicleWorld.length; k++) {
				for (int i = 0; i < vehicleWorld.length; i++) {
					if(vehicleWorld[i].getSpeed()>maxSpeed) {
						maxSpeed=vehicleWorld[i].getSpeed();
					}
				}
				if(vehicleWorld[k].getSpeed()==maxSpeed) {
					System.out.println("The maximum speed has: "+vehicleWorld[k]);
				}
			}
		}
		public void minPrice() {
			double arrprice[] = new double [vehicleWorld.length];
			for (int i = 0; i < arrprice.length; i++) {
				arrprice[i]=vehicleWorld[i].getPrice();
			}
			Arrays.sort(arrprice);
			for (int k = 0; k < vehicleWorld.length; k++) {
				if(vehicleWorld[k].getPrice()==arrprice[0]) {
					System.out.println("The minimum price has: "+vehicleWorld[k]);
				}
			}
		}
		public void printW() {
			for (int i = 0; i < vehicleWorld.length; i++) {
				System.out.println(vehicleWorld[i]);
			}
		}
		
	}

