package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int B = 0, H = 0;

		int T = input.nextInt();

		while (T < 1 || T > 50) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			B = input.nextInt();
			while (B < 1 || B > 1000) {
				B = input.nextInt();
			}

			H = input.nextInt();
			while (H < 1 || H > 1000) {
				H = input.nextInt();
			}
			
			int res = B * H;
			System.out.printf("Case %d: %d\n", i + 1, res);
		}
		input.close();

	}

}
