/*
 * The code given below calculates area of different shapes. Since the formula for 
 * calculating area is different for different shapes, the method calculateArea() has been overloaded.

Execute the code and observe the output.
 */

class Shape {

	// Method to find the area of circle
	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	// Method to find the area of rectangle
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	// Code another overloaded method to find the area of triangle
	public float calculateArea(float base, float height, boolean isTriangle) {
        return 0.5f * base * height;
    }
}

/* # Tester Class */
class Tester {

	public static void main(String[] args) {

		Shape shape = new Shape();

		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);
		 float triangleArea = shape.calculateArea(4.0f, 2.5f, true); // base = 4.0, height = 2.5

		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Area of triangle: " + triangleArea);

		// Invoke the method to find the area of triangle
		// Display the area of triangle
	}
}
