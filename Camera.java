/*
 * Two classes - Camera and Digital Camera are provided to you.

Though the object of DigitalCamera class is being created with values as 'Canon' and 
100 in the main method of Tester class, the code given below generates the following output.
* Nikon 0.0 16

Make the necessary changes in the code such that the member variables are initialized 
with proper values and the output is generated as follows:
Output: canon 100.0 16
 */

public class Camera {
	private String brand;
    private double cost;
    
    public Camera() {
        this.brand = "Nikon";
    }
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
}

class DigitalCamera extends Camera {
    private int memory;
    
    public DigitalCamera(String brand, double cost) {
        super();
        setBrand(brand);
        setCost(cost); 
        this.memory = 16;
    }
    
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
}
/* # Tester Class */
public class Tester {
	public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("canon", 100);
		System.out.println(camera.getBrand() + " " + camera.getCost() + " " + camera.getMemory());
    }

}
