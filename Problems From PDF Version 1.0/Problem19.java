package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem19 {

	public static void printPyramid(int storey) {
		int starCount = 1;
		for (int i = 0; i < storey; i++) {
			for (int j = 0; j < storey - 1 - i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			starCount += 2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] storeysCount;
		int N, storey;

		N = scan.nextInt();
		scan.nextLine();

		storeysCount = new int[N];

		for (int i = 0; i < N; i++) {
			storey = scan.nextInt();

			while (storey < 1 || storey > 100) {
				storey = scan.nextInt();
			}
			storeysCount[i] = storey;
		}
		scan.close();

		for (int i : storeysCount) {
			printPyramid(i);
			System.out.println();
		}

	}

}
