import java.util.Scanner;

public class Problem18_11 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers to find the sum of them: ");
		int n = input.nextInt();
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}

	
	public static int sumDigits(int n) {
		return sumDigits(n, 0);
	}

	private static int sumDigits(int n, int sum) {
		if (n == 0)
			return sum;
		else 
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}  