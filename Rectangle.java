public class Rectangle {
    // Instance variables
    public float length;
    public float width;

    // Method to calculate area
    public double calculateArea() {
        double area = length * width;
        return Math.round(area * 100.0) / 100.0; // round to 2 decimal places
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return Math.round(perimeter * 100.0) / 100.0; // round to 2 decimal places
    }
}
/* # Tester Class */
public class Tester {
    public static void main(String args[]) {
        // Create object of Rectangle
        Rectangle rectangle = new Rectangle();

        // Assign values to instance variables
        rectangle.length = 7.5f;
        rectangle.width = 3.2f;

        // Calculate area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Display the results
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }
}
