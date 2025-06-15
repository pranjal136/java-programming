/*
 * The Point class is used for representing a point with two coordinates.
Implement the class Point based on the class diagram and description given below.

Method Description:- 

- Point(double xCoordinate , double yCoordinate )

* Initialize the instance variables xCoordinate and yCoordinate appropriately 
* with the values passed to the constructor.

- calculateDistance()

* Calculate and return the distance of the point from the origin (0,0). 
* The distance can be calculated using the formula given below. 
* The distance should be rounded off to 2 decimal digits.
     distance=√((x2-x1)2+(y2-y1)2), where x1 and x2 are values of x-coordinates 
     of two points and y1 and y2 are values of y-coordinates of two points

- calculateDistance(Point point)

* Calculate and return the distance of the point from the 'point' passed to the method. 
* The distance should be rounded off to 2 decimal digits.

#Hints
* Use Math.sqrt(double d) method to calculate the square root
* Use Math.round(double d) method to round off the values
* Implement the getter and setter methods appropriately.
Test the functionalities using the provided Tester class. 
 */

class Point {
    //Implement your code here
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
}


class Tester {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
