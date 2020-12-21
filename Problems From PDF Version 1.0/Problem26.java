package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int D = 0, H = 0;

		int T = input.nextInt();

		while (T < 1 || T > 10) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			D = input.nextInt();
			while (D < 0 || D > 9) {
				D = input.nextInt();
			}

			H = input.nextInt();
			while (H < 1 || H > 20) {
				H = input.nextInt();
			}

			System.out.printf("Case %d:\n", i + 1);
			
			for (int j = 0; j < H; j++) {
				for (int j2 = 0; j2 < j + 1; j2++) {
					System.out.printf("%d ", D);
				}
				System.out.printf("\n");
			}
		}
		input.close();

	}

}
