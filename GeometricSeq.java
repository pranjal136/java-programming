/* Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.

1, 2, 4, 8, 16, 32, 64, ......, 1024 */
import java.util.*;

public class GeometricSeq {
	public static void main(String args[]) {
		int sequence = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of sequence: "); 

		//input the length of the sequence
		int n = sc.nextInt();
		while(n!=0)
		{
			System.out.print(sequence);
			System.out.print(" ");
			sequence *= 2;
			n-=1;
		}
	}
}
