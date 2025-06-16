/*
 * String Comparison
 * The code for comparing String values are provided. Both == and equals() are used.
Execute the given code and observe the output.
 */
class Tester {

	public static void main(String[] args) {
		String name1 = "Jennifer";
		String name2 = "Jennifer";
		String name3 = new String("Jennifer");

		System.out.println(name1 == name2); // both name1 and name2 refer to
											// same object
		System.out.println(name1 == name3); // name3 is a different object
											// created using new
		System.out.println(name2 == name3); // name3 is a different object
											// created using new

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name3));
		// Values are being compared in the above three cases and thus equals()
		// returns true

	}
}
