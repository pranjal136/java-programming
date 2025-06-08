/*
 * The Metro Bank provides various types of loans such as car loans, business loans and house loans 
 * to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and the EMI that the bank can provide 
to its customers based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:

account number of the customer

account balance of the customer

salary of the customer

loan type 

expected loan amount

expected no. of EMIs

The following validations should be performed:

The account number should be of 4 digits and its first digit should be 1

The customer should have a minimum balance of $1000 in the account

Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer 
is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. 
The bank decides the eligible loan amount and the number of EMIs based on the below table.
| **Salary >** | **Loan Type** | **Eligible Loan Amount** | **No. of EMIs** |
| ------------ | ------------- | ------------------------ | --------------- |
| 25,000       | Car           | 500,000                  | 36              |
| 50,000       | House         | 6,000,000                | 60              |
| 75,000       | Business      | 7,500,000                | 84              |

Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.

Display an appropriate message if the bank does not provide the loan.
 */

import java.util.Scanner;

public class MetroBankLoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Account Balance: ");
        double accountBalance = sc.nextDouble();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // consume newline

        System.out.print("Enter Loan Type (Car/House/Business): ");
        String loanType = sc.nextLine();

        System.out.print("Enter Expected Loan Amount: ");
        double expectedLoan = sc.nextDouble();

        System.out.print("Enter Expected No. of EMIs: ");
        int expectedEMIs = sc.nextInt();

        // Validation 1: Account number
        if (!(accountNumber >= 1000 && accountNumber <= 9999 && Integer.toString(accountNumber).startsWith("1"))) {
            System.out.println("Invalid account number. It should be a 4-digit number starting with 1.");
            return;
        }

        // Validation 2: Minimum account balance
        if (accountBalance < 1000) {
            System.out.println("Insufficient account balance. Minimum balance of $1000 required.");
            return;
        }

        // Determine eligible loan and EMIs based on salary and loan type
        double eligibleLoan = 0;
        int eligibleEMIs = 0;

        switch (loanType.toLowerCase()) {
            case "car":
                if (salary > 25000) {
                    eligibleLoan = 500000;
                    eligibleEMIs = 36;
                }
                break;
            case "house":
                if (salary > 50000) {
                    eligibleLoan = 6000000;
                    eligibleEMIs = 60;
                }
                break;
            case "business":
                if (salary > 75000) {
                    eligibleLoan = 7500000;
                    eligibleEMIs = 84;
                }
                break;
            default:
                System.out.println("Invalid loan type entered.");
                return;
        }

        // Final eligibility check
        if (eligibleLoan == 0 || expectedLoan > eligibleLoan || expectedEMIs > eligibleEMIs) {
            System.out.println("The customer is not eligible for the requested loan.");
        } else {
            System.out.println("\nLoan can be sanctioned!");
            System.out.println("Account Number       : " + accountNumber);
            System.out.println("Eligible Loan Amount : $" + eligibleLoan);
            System.out.println("Requested Loan Amount: $" + expectedLoan);
            System.out.println("Eligible EMIs        : " + eligibleEMIs);
            System.out.println("Requested EMIs       : " + expectedEMIs);
        }

        sc.close();
    }
}
