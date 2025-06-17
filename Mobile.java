/*
 * Happy Mobiles is a mobile manufacturer and they want to increase the rate of production. 
 * So, they have decided to add a feature for easily testing the compatibility of mobile 
 * operating system with generation of cellular network. You need to help them by creating an 
 * application based on the class diagram and description given below.
Method Description:-
- Mobile
* Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion)
* Initialize all the instance variables with the values passed to the constructor
* Implement the getter and setter methods appropriately. 

- SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration)
* Initialize all the instance variables with the values passed to the constructor
# testCompatibility()
* Check the compatibility of mobile operating system with network generation based on the table given below. 
* Return true if compatible, else return false.                                                                                                                                                                 
Implement the getter and setter methods appropriately. 
Perform case sensitive comparison wherever applicable.
Test the functionalities using the provided Tester class.
 */

interface Testable {
	boolean testCompatibility();
}

class Mobile {
	private String name;
	private String brand;
	private String operatingSystemName;
	private String operatingSystemVersion;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingSystemName() {
		return operatingSystemName;
	}
	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}
	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}
	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	
	public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
		this.name=name;
		this.brand=brand;
		this.operatingSystemName=operatingSystemName;
		this.operatingSystemVersion=operatingSystemVersion;
	}
}

class SmartPhone extends Mobile implements Testable {
	private String networkGeneration;

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
	
	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
		super(name,brand,operatingSystemName,operatingSystemVersion);
		this.networkGeneration=networkGeneration;
	}
	
	public boolean testCompatibility() {
		if(this.getOperatingSystemName().equals("Saturn")) {
			if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("1.1"))){
				return true;
			}
			else if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("1.2"))){
				return true;
			}
			else if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("1.3"))){
				return true;
			}
			else if(this.networkGeneration.equals("4G")&&(this.getOperatingSystemVersion().equals("1.2"))){
				return true;
			}
			else if(this.networkGeneration.equals("4G")&&(this.getOperatingSystemVersion().equals("1.3"))){
				return true;
			}
			else if(this.networkGeneration.equals("5G")&&(this.getOperatingSystemVersion().equals("1.3"))){
				return true;
			}
			else {
				return false;
			}
		}
		else if(this.getOperatingSystemName().equals("Gara")) {
			if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("EXRT.1"))){
				return true;
			}
			else if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("EXRT.2"))){
				return true;
			}
			else if(this.networkGeneration.equals("3G")&&(this.getOperatingSystemVersion().equals("EXRU.1"))){
				return true;
			}
			else if(this.networkGeneration.equals("4G")&&(this.getOperatingSystemVersion().equals("EXRT.2"))){
				return true;
			}
			else if(this.networkGeneration.equals("4G")&&(this.getOperatingSystemVersion().equals("EXRU.1"))){
				return true;
			}
			else if(this.networkGeneration.equals("5G")&&(this.getOperatingSystemVersion().equals("EXRU.1"))){
				return true;
			}
			else {
				return false;
			}
		}
		else
			return false;
	}
}
/* # Tester Class */
class Tester {
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		//Create more objects for testing your code
    SmartPhone smartPhone2 = new SmartPhone("GigaX100", "NovaTech", "Giga", "3.0", "5G");
        if (smartPhone2.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");

        SmartPhone smartPhone3 = new SmartPhone("TitanZ", "Skyline", "Titan", "4.1", "5G");
        if (smartPhone3.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");
	}
}
