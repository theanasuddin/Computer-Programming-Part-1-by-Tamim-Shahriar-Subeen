package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentence;
		String[] sentenceArr;
		int length;
		boolean containsCaps;

		int T = input.nextInt();

		while (T < 1 || T > 20) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			containsCaps = true;

			sentence = input.nextLine();

			if (sentence.replaceAll("\\s+", "").equals(sentence.replaceAll("\\s+", "").toLowerCase())) {
				containsCaps = false;
			}

			length = sentence.replaceAll("\\s{2,}", " ").trim().length();

			while (length > 150 || length < 1 || containsCaps) {
				containsCaps = true;
				sentence = input.nextLine();
				length = sentence.replaceAll("\\s{2,}", " ").trim().length();

				if (sentence.replaceAll("\\s+", "").equals(sentence.replaceAll("\\s+", "").toLowerCase())) {
					containsCaps = false;
				}
			}
			sentenceArr = sentence.replaceAll("\\s{2,}", " ").trim().split("\\s");

			for (int j = sentenceArr.length - 1; j >= 0; j--) {
				System.out.printf("%s ", sentenceArr[j]);
			}
			System.out.printf("\n");
		}
		input.close();

	}

}
