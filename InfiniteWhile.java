public class InfiniteWhile {
		public static void main(String[] args) {
			int totalCost = 0;
			char wantToAddFoodItem = 'Y';
			int unitPrice = 10;
			int quantity = 1;

			while (wantToAddFoodItem == 'Y') {
				totalCost = totalCost + (quantity * unitPrice);
				System.out.println("Order placed successfully");
				System.out.println("Total cost: " + totalCost);
				System.out.println("Do you want to add one more food item to the order?");
			}
			System.out.println("Thank you for ordering the food! It will reach you shortly...");
		}

}
