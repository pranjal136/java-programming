/*
 * EPay Wallet is a wallet application using which users can pay various bills. 
 * Users can make payments only if they have enough wallet balance.

There are two kinds of users – User and PremiumUser. PremiumUser gets reward points for every payment.
Implement the classes based on the class diagram and description given below.

Method Description:- 

- User
* User(int id, string userName, String emailId, double walletBalance)
* Initialize the instance variables with the values passed to the constructor.
# makePayment(double billAmount)
* Make the payment by deducting the billAmount from walletBalance if and only 
* if sufficient walletBalance is available.
* Return true if the payment is successful
* Return false if the walletBalance is insuffcient
* Implement the appropriate getter and setter methods.

- PremiumUser
# PremiumUser(int id, string userName, String emailId, double walletBalance)
* Initialize the instance variables with the values passed to the constructor.
# makePayment(double billAmount)
* Override the parent method to make payment as well as to credit reward points to the user.
* If the payment is successful, add 10% of the billAmount as rewardPoints
* Return true if the payment is successful, else return false 
* Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class. 
 */

class User{
    //Implement your code here
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;

    public User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if (walletBalance >= billAmount) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}

class PremiumUser extends User{
    //Implement your code here
    private int rewardPoints;

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
    }

    @Override
    public boolean makePayment(double billAmount) {
        if (super.makePayment(billAmount)) {
            rewardPoints += (int) (billAmount * 0.10); // 10% of billAmount
            return true;
        }
        return false;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
/* # Tester Class */
class Tester {

    public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

		PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

		processPayment(user, 70);

		processPayment(premiumUser, 150);

		processPayment(premiumUser, 80);

		processPayment(premiumUser, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
		}
		System.out.println("Your wallet balance is $" + user.getWalletBalance());

		if (user instanceof PremiumUser) {
			PremiumUser premiumUser = (PremiumUser) user;
			System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
		}
		System.out.println();
    }
}

