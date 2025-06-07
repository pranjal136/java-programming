public class NestedLoop {
		public static void main(String[] args) {
			for (int row = 1; row <= 4; row++) {
				for (int value = 1; value <= 5; value++) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
		}
}

/* #output:
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
  */
