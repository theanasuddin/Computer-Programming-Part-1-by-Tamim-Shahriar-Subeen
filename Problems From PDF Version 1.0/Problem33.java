package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long number;
		String numberStr;
		String answer;

		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			number = input.nextLong();

			while (number < 0 || number > 10000001) {
				number = input.nextLong();
			}

			numberStr = Long.toString(number);
			answer = "";

			for (int j = 0; j < numberStr.length(); j++) {
				int num = Integer.parseInt(String.valueOf(numberStr.charAt(j)));

				if (num % 2 == 0) {
					num = num + 1;
				} else {
					num = num - 1;
				}
				answer = answer + num;
			}
			System.out.println(Long.parseLong(answer));
		}
		input.close();

	}

}
