package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem23 {

	public static String getGrade(int num) {
		if (num >= 80 && num <= 100) {
			return "A+";
		} else if (num >= 75 && num <= 79) {
			return "A";
		} else if (num >= 70 && num <= 74) {
			return "A-";
		} else if (num >= 65 && num <= 69) {
			return "B+";
		} else if (num >= 60 && num <= 64) {
			return "B";
		} else if (num >= 55 && num <= 59) {
			return "B-";
		} else if (num >= 50 && num <= 54) {
			return "C";
		} else if (num >= 45 && num <= 49) {
			return "D";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int M;
		int[] marks;

		int T = input.nextInt();

		while (T < 1 || T > 25) {
			T = input.nextInt();
		}
		input.nextLine();
		marks = new int[T];

		for (int i = 0; i < T; i++) {
			M = input.nextInt();

			while (M < 0 || M > 100) {
				M = input.nextInt();
			}

			marks[i] = M;
		}
		input.close();

		for (int i = 0; i < marks.length; i++) {
			System.out.printf("Case %d: %s\n", i + 1, getGrade(marks[i]));
		}

	}

}
