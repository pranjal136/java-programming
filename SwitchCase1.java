public class SwitchCase1 {
		public static void main(String[] args) {
			String orderedFood = "Pizza";
			switch (orderedFood) {
			case "Burger":
				System.out.println("You have ordered Burger. Unit price: $10");
				break;
			case "Pizza":
				System.out.println("You have ordered Pizza. Unit price: $15");
				break;
			case "Sandwich":
				System.out.println("You have ordered Sandwich. Unit price: $8");
				break;
			default:
				System.out.println("Invalid selection");
			}
		}
}
