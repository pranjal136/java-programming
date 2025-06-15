/*
 * The Triangle class is used for representing triangles. The vertices of the triangle 
 * will be represented using the Point class created in Method Overloading - Exercise 1.
Implement the class Triangle based on the class diagram and description given below.

Method Description

- Triangle()
* Initialize the instance variables point1, point2 and point3 with the following coordinate values
       point1 - 0, 0
       point2 - 1, 1 
       point3 - 2, 5

- Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, 
double point2YCoordinate, double point3XCoordinate, double point3YCoordinate)

* Initialize the instance variables point1, point2 and point3 with the following coordinate values
       point1 - point1XCoordinate, point1YCoordinate
       point2 - point2XCoordinate, point2YCoordinate 
       point3 - point3XCoordinate, point3YCoordinate

- Triangle(Point point1, Point point2, Point point3)
* Initialize the instance variables point1, point2 and point3 appropriately 
* with the values passed to the constructor
#calculatePerimeter()
* Calculates and return the perimeter of the triangle using the formula given below.
     perimeter=a+b+c, where a, b and c are the lengths of each side of the triangle 

# calculateArea()
* Calculate and return the area of the triangle using the formula given below
     area=√(s(s-a)(s-b)(s-c)), where a, b and c are the lengths of each side of the triangle and s=(a+b+c)/2 

NOTE: perimeter and area should be rounded off to 2 decimal digits.
# Hint
* Use Math.sqrt(double d) method to calculate the square root.
* Implement the getter and setter methods appropriately.

Test the functionalities using the provided Tester class.
 */

class Point{
    //Reuse the code of Method Overloading - Exercise 1
    private double xCoordinate;
    private double yCoordinate;
    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public double calculateDistance(){
        double x2 = this.xCoordinate, x1 = 0.0, y2 = this.yCoordinate, y1 = 0.0;
        double d = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double distance = Math.sqrt(d);
        return Math.round(distance*100.0)/100.0;
    }
    public double calculateDistance(Point point){
        double x2 = this.xCoordinate, x1 = point.xCoordinate, y2 = this.yCoordinate, y1 = point.yCoordinate;
        double d = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double distance = Math.sqrt(d);
        return Math.round(distance*100.0)/100.0;
    }
    public double getxCoordinate(){
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public double getyCoordinate(){
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
    
}
/* # Triangle Class */
class Triangle {
    //Implement your code here
    private Point point1;
    private Point point2;
    private Point point3;

    // No-arg constructor
    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(1, 1);
        this.point3 = new Point(2, 5);
    }

    // Constructor with coordinates
    public Triangle(double point1XCoordinate, double point1YCoordinate,
                    double point2XCoordinate, double point2YCoordinate,
                    double point3XCoordinate, double point3YCoordinate) {
        this.point1 = new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }

    // Constructor with Point objects
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);
        double perimeter = a + b + c;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public double calculateArea() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Math.round(area * 100.0) / 100.0;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}
/* # Tester Class */
class Tester {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
		
		//Create more objects of Triangle class for testing your code      

	}
}

