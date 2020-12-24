package ComputerProgrammingPartOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem22 {

	static int is_prime(int n) {
		int i, root;

		if (n < 2) {
			return 0;
		}

		if (n == 2) {
			return 1;
		}

		if (n % 2 == 0) {
			return 0;
		}

		root = (int) Math.sqrt(n);

		for (i = 3; i <= root; i += 2) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int num = input.nextInt();

		while (num >= 2 && num <= 65536) {
			numbers.add(num);
			num = input.nextInt();
		}
		input.close();

		for (Integer number : numbers) {
			System.out.printf("%d =", number);

			ArrayList<Integer> primes = new ArrayList<Integer>();
			ArrayList<Integer> primesSelected = new ArrayList<Integer>();
			for (int i = 2; i <= number; i++) {
				if (is_prime(i) == 1) {
					primes.add(i);
				}
			}

			int j = 0;
			int prime;
			for (; j < primes.size(); j++) {
				prime = primes.get(j);
				if (number % prime == 0) {
					j = -1;
					primesSelected.add(prime);
					number = number / prime;
				}

			}

			Collections.sort(primesSelected);

			ArrayList<Integer> primesSelectedCopy = new ArrayList<Integer>();
			primesSelectedCopy.addAll(primesSelected);

			for (int k = 0; k < primesSelectedCopy.size();) {

				int counter = 0;
				for (int j2 = 0; j2 < primesSelected.size(); j2++) {
					if (primesSelectedCopy.get(k).equals(primesSelected.get(j2))) {
						counter++;
					}
				}
				System.out.printf(" %d^%d", primesSelectedCopy.get(k), counter);

				primesSelectedCopy.removeAll(Collections.singleton(primesSelectedCopy.get(k)));

				if (!primesSelectedCopy.isEmpty()) {
					System.out.printf(" *");
				}
			}
			System.out.printf("\n");
		}

	}

}
