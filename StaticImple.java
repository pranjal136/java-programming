//The following code makes use of static variables, methods and blocks.

public class Tester {
		public static void main(String[] args) {
			Car c1 = new Car("Red");
			Car c2 = new Car("Green");
			Car c3 = new Car("Blue");
			System.out.println("Number of cars created: " + Car.getNumberOfCars());
		}

		static {
			System.out.println("Tester class loaded");
		}
	}

	class Car {
		private String color;
		private static int numberOfCars = 0;

		static {
			System.out.println("Car class loaded");
		}

		public Car(String color) {
			this.color = color;
			numberOfCars++;
		}

		public static String getColor() {
			return "color";
		}

		public static int getNumberOfCars() {
			return numberOfCars;
		}
	
}
