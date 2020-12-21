package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 0, N = 0;

		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			x = input.nextInt();
			while (x < 1 || x > 1000000) {
				x = input.nextInt();
			}

			N = input.nextInt();
			while (N < x || N > 1000000) {
				N = input.nextInt();
			}

			System.out.printf("Case %d:", i + 1);

			int counter = 1;
			int mul = counter * x;

			while (mul <= N) {
				System.out.printf(" %d", mul);
				counter++;
				mul = counter * x;
			}
			System.out.printf("\n");
		}
		input.close();

	}

}
