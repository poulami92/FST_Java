package activities;
	
 class Car {
		
		public String color;
		public String transmission;
		public int make;
		public int tyres;
		public int doors;
		
		public Car() {
			
			tyres = 4;
			doors = 4;
		}
		
		public void displayCharacteristics() {
			
			System.out.println("Color of car: " +color);
			System.out.println("Transmission of the car: " +transmission);
			System.out.println("Make of the car: " +make);
			System.out.println("Number of tyres on the car: " +tyres);
			System.out.println("Number of doors on the car: " +doors);
			System.out.println("branch 1 change");
			System.out.println("branch 1 change");
			
   }
		
		public void accelerate() {
			
			System.out.println("Car is moving forward");
			
		}
		
	    public void brake() {
			
			System.out.println("Car has stopped");
			
		}
	}


public class Activity1 {


	public static void main(String[] args) {
		
		Car carName = new Car();
		carName.make=2014;
		carName.color="black";
		carName.transmission="Manual";
		
		carName.displayCharacteristics();
		carName.accelerate();
		carName.brake();
	}

}
