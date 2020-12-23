package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");

			while (tempArray[0].length() > 128 || tempArray[0].length() < 1 || tempArray[1].length() > 128
					|| tempArray[1].length() < 1) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			String main = tempArray[0];
			String sub = tempArray[1];

			if (main.contains(sub)) {
				System.out.println(main.indexOf(sub));
			} else {
				System.out.println('"' + sub + '"' + " is not a valid substring of " + '"' + main + '"');
			}

		}

	}

}