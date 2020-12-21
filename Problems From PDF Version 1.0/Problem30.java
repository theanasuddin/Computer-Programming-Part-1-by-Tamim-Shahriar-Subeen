package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A = 0, B = 0, C = 0;

		int T = input.nextInt();

		while (T < 1 || T > 50) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			A = input.nextInt();
			while (A < 0 || A > 1000) {
				A = input.nextInt();
			}

			B = input.nextInt();
			while (B < 0 || B > 1000) {
				B = input.nextInt();
			}

			C = input.nextInt();
			while (C < 0 || C > 1000) {
				C = input.nextInt();
			}

			System.out.printf("Case %d: ", i + 1);

			int diff1 = B - A;
			int diff2 = C - B;

			double ratio1 = (double) B / A;
			double ratio2 = (double) C / B;

			if (diff1 == diff2 && ratio1 == ratio2) {
				System.out.printf("Both\n");
			} else if (diff1 == diff2) {
				System.out.printf("Arithmetic Progression\n");
			} else if (ratio1 == ratio2) {
				System.out.printf("Geometric Progression\n");
			} else {
				System.out.printf("None\n");
			}

		}
		input.close();

	}

}
