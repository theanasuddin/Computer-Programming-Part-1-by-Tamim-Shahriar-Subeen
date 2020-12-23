package ComputerProgrammingPartOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem39 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter term T (1 <= T <= 100): ");
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			System.out.println("Enter term T (1 <= T <= 100): ");
			T = input.nextInt();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<Integer>[] al = new ArrayList[T];

		for (int i = 0; i < T; i++) {
			al[i] = new ArrayList<Integer>();
			System.out.println(
					"Enter opponent's total run r1 (1 <= r1 <= 1000); team's current run r2 (1 <= r2 <= 1000); ball left B (1<=B<=300): ");
			line = br.readLine();
			int numbers[] = toIntegerArray(line);
			int num1 = numbers[0];
			int num2 = numbers[1];
			int num3 = numbers[2];

			while (num1 > 1000 || num1 < 1 || num2 > 1000 || num2 < 1 || num3 < 1 || num3 > 300) {
				System.out.println(
						"Wrong! Enter opponent's total run r1 (1 <= r1 <= 1000); team's current run r2 (1 <= r2 <= 1000); ball left B (1<=B<=300): ");
				line = br.readLine();
				numbers = toIntegerArray(line);
				num1 = numbers[0];
				num2 = numbers[1];
				num3 = numbers[2];
			}
			al[i].add(numbers[0]);
			al[i].add(numbers[1]);
			al[i].add(numbers[2]);
		}
		input.close();
		for (int i = 0; i < T; i++) {
			int r1 = al[i].get(0);
			int r2 = al[i].get(1);
			int B = al[i].get(2);
			calcRunRate(r1, r2, B);
		}

	}

	public static int[] toIntegerArray(String line) {
		String[] lineSplitted = line.trim().split(" ");
		int[] numbers = new int[lineSplitted.length];

		for (int j = 0; j < lineSplitted.length; j++) {
			numbers[j] = Integer.parseInt(lineSplitted[j]);
		}
		return numbers;
	}

	public static void calcRunRate(int r1, int r2, int B) {
		double currentRate = r2 / ((300 - B) / 6);
		double requiredRate = ((r1 - r2) + 1) / (B / 6);
		System.out.printf("%.2f  %.2f\n", currentRate, requiredRate);
	}

}