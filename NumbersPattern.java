public class NumbersPattern {
		public static void main(String[] args) {
			int rows = 10;
			for (int i = 1; i <= rows; ++i) {
				for (int j = 1; j <= i; ++j) {
	                // print displays the text without adding a new line
					System.out.print(j + " "); 
				}
				System.out.println(""); // println displays the text along with a new line
			}
		}
}


/* #output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10 
*/
