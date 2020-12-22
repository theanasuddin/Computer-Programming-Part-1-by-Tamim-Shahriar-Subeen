package ComputerProgrammingPartOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem35 {

	public static String decimalToBinary(int decimal) {
		ArrayList<String> binaryList = new ArrayList<String>();

		int quotient = (int) (decimal / 2);
		int remainder = decimal % 2;

		while (quotient != 0) {
			binaryList.add(String.valueOf(remainder));
			decimal = quotient;
			quotient = (int) (decimal / 2);
			remainder = decimal % 2;
		}
		binaryList.add(String.valueOf(decimal % 2));

		Collections.reverse(binaryList);
		return String.join("", binaryList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N;

		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			N = input.nextInt();

			while (N < 1 || N > 10) {
				N = input.nextInt();
			}

			for (int j = 0; j < Math.pow(2, N); j++) {
				if (decimalToBinary(j).length() == N) {
					System.out.println(decimalToBinary(j));
				}
			}

		}
		input.close();

	}

}
