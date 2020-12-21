package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;

		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			n1 = input.nextInt();
			n2 = input.nextInt();
			n3 = input.nextInt();

			while (n1 > 1000 || n2 > 1000 || n3 > 1000) {
				if (n1 > 1000) {
					n1 = input.nextInt();
				}

				if (n2 > 1000) {
					n2 = input.nextInt();
				}

				if (n3 > 1000) {
					n3 = input.nextInt();
				}
			}

			if (n1 <= n2 && n1 <= n3) {
				System.out.printf("Case %d: %d ", i + 1, n1);
				if (n2 <= n3) {
					System.out.printf("%d %d\n", n2, n3);
				} else {
					System.out.printf("%d %d\n", n3, n2);
				}
			} else if (n2 <= n1 && n2 <= n3) {
				System.out.printf("Case %d: %d ", i + 1, n2);
				if (n1 <= n3) {
					System.out.printf("%d %d\n", n1, n3);
				} else {
					System.out.printf("%d %d\n", n3, n1);
				}
			} else if (n3 <= n1 && n3 <= n2) {
				System.out.printf("Case %d: %d ", i + 1, n3);
				if (n1 <= n2) {
					System.out.printf("%d %d\n", n1, n2);
				} else {
					System.out.printf("%d %d\n", n2, n1);
				}
			}
		}
		input.close();

	}

}
