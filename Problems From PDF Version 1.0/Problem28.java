package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 10) {
			T = input.nextInt();
		}

		for (int i = 0; i < T; i++) {
			int n = input.nextInt();
			while (n < 1 || n > 100000) {
				n = input.nextInt();
			}
			System.out.print("Case " + (i + 1) + ": ");
			factor(n);
			System.out.println();
		}
		input.close();

	}

	public static void factor(int number) {
		for (int i = 1; i <= number; ++i) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
