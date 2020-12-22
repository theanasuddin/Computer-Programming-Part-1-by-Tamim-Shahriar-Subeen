package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int S, year, month, day, hour, minute, second;

		int T = input.nextInt();

		while (T < 1 || T > 50) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			S = input.nextInt();

			while (S < 1 || S > Math.pow(10, 9)) {
				S = input.nextInt();
			}

			second = S % 60;
			minute = S / 60;
			hour = minute / 60;
			day = hour / 24;
			month = day / 30;
			year = month / 12;

			month = month % 12;
			day = day % 30;
			hour = hour % 24;
			minute = minute % 60;

			System.out.printf("Case %d: ", i + 1);

			if (year >= 1) {
				if (year == 1) {
					System.out.printf("%d year ", year);
				} else {
					System.out.printf("%d years ", year);
				}
			}

			if (month >= 1) {

				if (month == 1) {
					System.out.printf("%d month ", month);
				} else {
					System.out.printf("%d months ", month);
				}

			}

			if (day >= 1) {

				if (day == 1) {
					System.out.printf("%d day ", day);
				} else {
					System.out.printf("%d days ", day);
				}

			}

			if (hour >= 1) {

				if (hour == 1) {
					System.out.printf("%d hour ", hour);
				} else {
					System.out.printf("%d hours ", hour);
				}

			}

			if (minute >= 1) {

				if (minute == 1) {
					System.out.printf("%d minute ", minute);
				} else {
					System.out.printf("%d minutes ", minute);
				}

			}

			if (second != 0) {
				if (second == 1) {
					System.out.printf("%d second ", second);
				} else {
					System.out.printf("%d seconds ", second);
				}
			}
			System.out.printf("\n");
		}
		input.close();

	}

}
