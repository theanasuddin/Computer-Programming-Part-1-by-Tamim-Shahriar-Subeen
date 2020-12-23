package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 10) {
			T = input.nextInt();
		}
		input.nextLine();
		int[] n = new int[T];
		for (int i = 0; i < n.length; i++) {
			int temp = input.nextInt();
			while (temp < 2 || temp > 1000000000) {
				temp = input.nextInt();
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			if (isPrime(n[i])) {
				System.out.println(n[i] + " is a prime");
			} else {
				System.out.println(n[i] + " is not a prime");
			}
		}
	}

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}