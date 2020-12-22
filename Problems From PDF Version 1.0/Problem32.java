package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem32 {

	public static boolean doOverlapOrNot(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		if (x3 > x2) {
			return false;
		}
		if (x4 < x1) {
			return false;
		}
		if (x4 >= x1 && y3 >= y2) {
			return false;
		}
		if (x4 >= x1 && y4 <= y1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4;

		int T = input.nextInt();

		while (T < 1 || T > 25) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			x1 = input.nextInt();

			while (x1 < -100 || x1 > 100) {
				x1 = input.nextInt();
			}

			y1 = input.nextInt();

			while (y1 < -100 || y1 > 100) {
				y1 = input.nextInt();
			}

			x2 = input.nextInt();

			while (x2 < -100 || x2 > 100 || x2 <= x1) {
				x2 = input.nextInt();
			}

			y2 = input.nextInt();

			while (y2 < -100 || y2 > 100 || y2 <= y1) {
				y2 = input.nextInt();
			}

			x3 = input.nextInt();

			while (x3 < -100 || x3 > 100) {
				x3 = input.nextInt();
			}

			y3 = input.nextInt();

			while (y3 < -100 || y3 > 100) {
				y3 = input.nextInt();
			}

			x4 = input.nextInt();

			while (x4 < -100 || x4 > 100 || x4 <= x3) {
				x4 = input.nextInt();
			}

			y4 = input.nextInt();

			while (y4 < -100 || y4 > 100 || y4 <= y3) {
				y4 = input.nextInt();
			}

			if (doOverlapOrNot(x1, y1, x2, y2, x3, y3, x4, y4) == true) {
				System.out.printf("Case %d: Yes ", i + 1);
			} else {
				System.out.printf("Case %d: No ", i + 1);
			}

		}
		input.close();

	}

}
