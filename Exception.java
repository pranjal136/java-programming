/*
 * A bank wants to conduct examinations for recruitment. You need to develop an application 
 * for the applicants to submit their details by implementing the classes based 
 * on the class diagram and description given below.
Note: The Applicant class is implemented and provided to you.

- Validator
Method Description
# validateName(String name)
* Validate that the name is not null or empty. If the name is null or empty, return false, else return true.
# validateJobProfile(String jobProfile)
* Validate that the jobProfile is either 'Associate' or 'Clerk' or 'Executive' or 'Officer'. 
* If the jobProfile is valid, return true, else return false. Perform case-insensitive comparison.
# validateAge(int age)
* Validate that the age is between 18 and 30 (both inclusive). If the age is valid, 
* return true, else return false
# validate(Applicant applicant)
* Validate the details of the applicant by calling the appropriate methods. 
* If any validation fails, throw user defined exceptions based on the below description.                                                                                                
* Implement the required user defined exception classes.
* Test the functionalities using the main method of the provided Tester class based on the below description.
* Create an object of Applicant class and set the values of all the instance variables
* Validate the details of the applicant by invoking the validate() method of the Validator class
* If all the details are valid, display 'Application submitted successfully!', 
* else, display appropriate error message
Note: The Tester class will not be verified.
 */

// Implement user defined exception classes 
class InvalidNameException extends Exception {
	InvalidNameException(String msg) {
		super(msg);
	}
}

class InvalidJobProfileException extends Exception {
	InvalidJobProfileException(String msg) {
		super(msg);
	}
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		super(msg);
	}
}

class Applicant {

    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }
      
    public void setName(String name) {
        this.name = name;
    }
      
    public String getJobProfile() {
         return jobProfile;
    }
      
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
      
    public int getAge() {
        return age;
    }
      
    public void setAge(int age) {
        this.age = age;
    }
}


class Validator{
    //Implement your code here
    public boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public boolean validateJobProfile(String jobProfile) {
        if (jobProfile == null) return false;
        String jp = jobProfile.toLowerCase();
        return jp.equals("associate") || jp.equals("clerk") || jp.equals("executive") || jp.equals("officer");
    }

    public boolean validateAge(int age) {
        return age >= 18 && age <= 30;
    }

    public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        if (!validateName(applicant.getName())) {
            throw new InvalidNameException("Invalid name");
        }
        if (!validateJobProfile(applicant.getJobProfile())) {
            throw new InvalidJobProfileException("Invalid job profile");
        }
        if (!validateAge(applicant.getAge())) {
            throw new InvalidAgeException("Invalid age");
        }
    }
}
/* # Tester Class */
class Tester {

    public static void main(String[] args) {
            
        try {
            Applicant applicant= new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);
            
            Validator validator = new Validator();
                  
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } 
        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
