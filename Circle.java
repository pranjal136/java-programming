/*
 * Implement the following class based on the class diagram and description given below.
Method Description

- Circle(double diameter)
* Initialize the instance variable diameter with the value passed to the constructor.
# calculateCircumference()
* Calculate and set the circumference of the circle using the formula given below.
* circumference = πd, where d is the diameter
# calculateArea()
* Calculate and set the area of the circle using the formula given below.
* area=πr2, where r is the radius
Note: PI is a final variable.
Implement the getter and setter methods appropriately.
Test the functionalities using the provided Tester class. 
 */

class Circle{
    //Implement your code here
    // Constants and instance variables
    private final double PI = 3.14;
    private double diameter;
    private double circumference;
    private double area;


    // Getter and Setter methods
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPI() {
        return PI;
    }
    
    // Constructor
    public Circle(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate circumference
    public void calculateCircumference() {
        circumference = this.getDiameter()*(this.PI);
        this.setCircumference(circumference);
    }

    // Method to calculate area
    public void calculateArea() {
        double r = this.getDiameter() / 2;
        area = (this.PI)*(r*r);
        this.setArea(area);
    }
}
/* # Tester Class */
class Tester{
      
    public static void main(String[] args) {
            
        Circle circle1 = new Circle(10.2);
        Circle circle2 = new Circle(5.7);

        //Create more objects of Circle class and add to the array given below for testing your code    
        Circle[] circles = {circle1, circle2};
            
        for (Circle circle : circles) {
                  
            circle.calculateCircumference();
            circle.calculateArea();
                  
            System.out.println("Diameter of the circle is "+circle.getDiameter());
            System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
            System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
            System.out.println();
        }           
    }
}

