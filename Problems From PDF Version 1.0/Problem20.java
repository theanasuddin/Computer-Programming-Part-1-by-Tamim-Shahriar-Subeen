package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem20 {

	public static void isMagicOrNormal(String str) {

		int oneCount = 0, zeroCount = 0;

		if (str.charAt(0) == '0') {
			System.out.printf("MAGIC\n");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				oneCount++;
			} else if (str.charAt(i) == '0') {
				zeroCount++;
			}

			if (zeroCount > oneCount) {
				System.out.printf("MAGIC\n");
				return;
			}
		}
		System.out.printf("NORMAL\n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] strings;
		int N, stringLength;
		String string;

		N = scan.nextInt();
		while (N < 1) {
			N = scan.nextInt();
		}
		scan.nextLine();

		strings = new String[N];

		for (int i = 0; i < N; i++) {
			string = scan.next();

			stringLength = string.length();

			while (stringLength < 1 || stringLength > 50) {
				string = scan.next();

				stringLength = string.length();
			}

			strings[i] = string;
		}
		scan.close();

		for (String str : strings) {
			isMagicOrNormal(str);
		}

	}

}
