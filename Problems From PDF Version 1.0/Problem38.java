package ComputerProgrammingPartOne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem38 {

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
				Pattern pattern = Pattern.compile(sub);
				System.out.println(countMatches(pattern, main));
			} else {
				System.out.println(0);
			}

		}

	}

	static int countMatches(Pattern pattern, String string) {
		Matcher matcher = pattern.matcher(string);

		int count = 0;
		int pos = 0;
		while (matcher.find(pos)) {
			count++;
			pos = matcher.start() + 1;
		}
		return count;
	}

}