public class IfElseIf {
		public static void main(String[] args) {
			String customerType = "Regular";
			int quantity = 3;
			int unitPrice = 10;
			int discount = 5;
			int deliveryCharge = 5;
			int totalCost = unitPrice * quantity;
			if (customerType == "Regular") {
				totalCost = totalCost - (totalCost * discount / 100);
				System.out.println("You are a regular customer and eligible for 5% discount");
				System.out.println("The total cost to be paid is " + totalCost);
			} 
			else if (customerType == "Guest") 
			{
				totalCost = totalCost + deliveryCharge;
				System.out.println("You need to pay an additional delivery charge of $5");
				System.out.println("The total cost to be paid is" + totalCost);
			} 
			else // If there is only one statement inside a block, {} is optional
				System.out.println("Invalid customer type");
		}
}
