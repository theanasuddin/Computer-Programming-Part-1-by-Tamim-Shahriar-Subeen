package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String startTime, endTime;
		String[] startTimeInArray;
		int[] startTimeInIntArray;
		String[] endTimeInArray;
		int[] endTimeInIntArray;
		int C, timeInSeconds, result, hourCount, minuteCount, secondCount;
		int[] results;

		int N = input.nextInt();

		while (N < 1 || N >= 20) {
			N = input.nextInt();
		}
		input.nextLine();
		results = new int[N];

		for (int i = 0; i < N; i++) {
			startTime = input.nextLine();
			startTimeInArray = startTime.trim().split("\\s+");

			startTimeInIntArray = new int[startTimeInArray.length];

			int counter = 0;
			for (String time : startTimeInArray) {
				startTimeInIntArray[counter] = Integer.parseInt(time);
				counter++;
			}

			while (startTimeInIntArray[0] < 0 || startTimeInIntArray[0] >= 24 || startTimeInIntArray[1] < 0
					|| startTimeInIntArray[1] >= 60 || startTimeInIntArray[2] < 0 || startTimeInIntArray[2] >= 60) {
				startTime = input.nextLine();
				startTimeInArray = startTime.trim().split("\\s+");

				startTimeInIntArray = new int[startTimeInArray.length];

				counter = 0;
				for (String time : startTimeInArray) {
					startTimeInIntArray[counter] = Integer.parseInt(time);
					counter++;
				}
			}

			endTime = input.nextLine();
			endTimeInArray = endTime.trim().split("\\s+");

			endTimeInIntArray = new int[endTimeInArray.length];

			counter = 0;
			for (String time : endTimeInArray) {
				endTimeInIntArray[counter] = Integer.parseInt(time);
				counter++;
			}

			while (endTimeInIntArray[0] < 0 || endTimeInIntArray[0] >= 24 || endTimeInIntArray[1] < 0
					|| endTimeInIntArray[1] >= 60 || endTimeInIntArray[2] < 0 || endTimeInIntArray[2] >= 60) {
				endTime = input.nextLine();
				endTimeInArray = endTime.trim().split("\\s+");

				endTimeInIntArray = new int[endTimeInArray.length];

				counter = 0;
				for (String time : endTimeInArray) {
					endTimeInIntArray[counter] = Integer.parseInt(time);
					counter++;
				}
			}
			C = input.nextInt();
			input.nextLine();

			while (C < 1 || C > 5) {
				C = input.nextInt();
			}

			if (startTimeInIntArray[0] > endTimeInIntArray[0]) {
				hourCount = (23 - startTimeInIntArray[0]) + endTimeInIntArray[0];
			} else {
				hourCount = endTimeInIntArray[0] - startTimeInIntArray[0];
			}

			if (startTimeInIntArray[1] > endTimeInIntArray[1]) {
				minuteCount = (59 - startTimeInIntArray[1]) + endTimeInIntArray[1];
			} else {
				minuteCount = endTimeInIntArray[1] - startTimeInIntArray[1];
			}

			if (startTimeInIntArray[2] > endTimeInIntArray[2]) {
				secondCount = (60 - startTimeInIntArray[2]) + endTimeInIntArray[2];
			} else {
				secondCount = endTimeInIntArray[2] - startTimeInIntArray[2];
			}

			timeInSeconds = (hourCount * 3600) + (minuteCount * 60) + secondCount;
			result = timeInSeconds * C;

			results[i] = result;

		}
		input.close();

		for (int j : results) {
			System.out.printf("%d\n", j);
		}

	}

}
