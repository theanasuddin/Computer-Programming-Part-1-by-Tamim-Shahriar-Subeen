package ComputerProgrammingPartOne;

public class SortingGivenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara1[] = { 3, 1, 5, 2, 4 };

		int i, minimum, index_2;

		for (index_2 = 0; index_2 < 5; index_2++) {
			minimum = ara1[index_2];

			for (i = index_2 + 1; i < 5; i++) {
				if (ara1[i] < minimum) {
					minimum = ara1[i];
					ara1[i] = ara1[index_2];
					ara1[index_2] = minimum;
				}
			}

		}

		for (i = 0; i < 5; i++) {
			System.out.printf("%d\n", ara1[i]);
		}

	}

}
