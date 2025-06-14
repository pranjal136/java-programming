/*
* You need to develop an application for cab service providers by implementing the classes 
 * based on the class diagram and description given below.
Note: Driver class is provided to you.

Method Description :- 

- CabServiceProvider
* CabServiceProvider(String cabServiceName, int totalCabs)
* Initialize all the instance variables appropriately with the values passed to the constructor.
* 
- calculateRewardPrice(Driver driver)
* Calculate and return the bonus of the driver based on the below table. 
* If averageRating of the driver is less than 4, return the bonus as 0.
| **Cab Service** | **Rating Range**   | **Reward Amount** |
| --------------- | ------------------ | ----------------- |
| **Halo**        | 4.5 ≤ rating ≤ 5.0 | `10 * rating`     |
|                 | 4.0 ≤ rating < 4.5 | `5 * rating`      |
| **Aber**        | 4.5 ≤ rating ≤ 5.0 | `8 * rating`      |
|                 | 4.0 ≤ rating < 4.5 | `3 * rating`      |

In case of any invalid value, return the bonus as 0. 
Note: Round off the bonus to 2 decimal digits.

* Implement the appropriate getter and setter methods.
* Perform case-sensitive comparison wherever applicable.
* Test the functionalities using the provided Tester class. 

 */

public class CabServiceProvider {
	//Implement your code here
    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs) {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return totalCabs;
    }

    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }

    public double calculateRewardPrice(Driver driver) {
        float rating = driver.getAverageRating();
        double reward = 0.0;

        if (rating < 4.0f || rating > 5.0f) {
            return 0.0;
        }

        if (cabServiceName.equals("Halo")) {
            if (rating >= 4.5f && rating <= 5.0f) {
                reward = 10 * rating;
            } else if (rating >= 4.0f && rating < 4.5f) {
                reward = 5 * rating;
            }
        } else if (cabServiceName.equals("Aber")) {
            if (rating >= 4.5f && rating <= 5.0f) {
                reward = 8 * rating;
            } else if (rating >= 4.0f && rating < 4.5f) {
                reward = 3 * rating;
            }
        }

        return Math.round(reward * 100.0) / 100.0; // round to 2 decimal places
    }


}

/* # Driver Class */
public class Driver {
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }

}

/* # Tester Class */
public class Tester {
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) 
		{
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
		CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber", 80);
		Driver driver4 = new Driver("John", 4.6f);
		Driver driver5 = new Driver("Paul", 4.3f);
		Driver[] driversList2 = { driver4, driver5 };
		for (Driver driver : driversList2) 
		{
		    System.out.println("Driver Name: " + driver.getDriverName());
		    double bonus = cabServiceProvider2.calculateRewardPrice(driver);
		    if (bonus > 0)
		       System.out.println("Bonus: $" + bonus + "\n");
		   else
               System.out.println("Sorry, bonus is not available!");
		}

	}

}
