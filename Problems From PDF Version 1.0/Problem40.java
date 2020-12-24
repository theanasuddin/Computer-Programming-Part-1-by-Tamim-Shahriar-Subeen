package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem40 {

	public static int getNumberOfMoves(int r1, int c1, int r2, int c2) {
		int counter = 0;

		if (c1 == c2) {
			if (r1 == r2) {
				return counter;
			} else if (r2 > r1) {
				while (r1 != r2) {
					r1++;
					counter++;
				}
				return counter;
			} else if (r2 < r1) {
				while (r1 != r2) {
					r1--;
					counter++;
				}
				return counter;
			}
		}

		if (r1 == r2) {
			if (c1 == c2) {
				return counter;
			} else if (c2 > c1) {
				while (c1 != c2) {
					c1++;
					counter++;
				}
				return counter;
			} else if (c2 < c1) {
				while (c1 != c2) {
					c1--;
					counter++;
				}
				return counter;
			}
		}

		if (r2 > r1 && c2 > c1) {
			while (r1 != r2 && c1 != c2) {
				r1++;
				c1++;
				counter++;

				if (r1 == r2 || c1 == c2) {
					if (r1 == r2) {
						while (c1 != c2) {
							c1++;
							counter++;
						}
						return counter;
					} else if (c1 == c2) {
						while (r1 != r2) {
							r1++;
							counter++;
						}
						return counter;
					}
				}

			}
			return counter;
		}

		if (r2 > r1 && c2 < c1) {
			while (r1 != r2 && c1 != c2) {
				r1++;
				c1--;
				counter++;

				if (r1 == r2 || c1 == c2) {
					if (r1 == r2) {
						while (c1 != c2) {
							c1--;
							counter++;
						}
						return counter;
					} else if (c1 == c2) {
						while (r1 != r2) {
							r1++;
							counter++;
						}
						return counter;
					}
				}

			}
			return counter;
		}

		if (r2 < r1 && c2 < c1) {
			while (r1 != r2 && c1 != c2) {
				r1--;
				c1--;
				counter++;

				if (r1 == r2 || c1 == c2) {
					if (r1 == r2) {
						while (c1 != c2) {
							c1--;
							counter++;
						}
						return counter;
					} else if (c1 == c2) {
						while (r1 != r2) {
							r1--;
							counter++;
						}
						return counter;
					}
				}

			}
			return counter;
		}

		if (r2 < r1 && c2 > c1) {
			while (r1 != r2 && c1 != c2) {
				r1--;
				c1++;
				counter++;

				if (r1 == r2 || c1 == c2) {
					if (r1 == r2) {
						while (c1 != c2) {
							c1++;
							counter++;
						}
						return counter;
					} else if (c1 == c2) {
						while (r1 != r2) {
							r1--;
							counter++;
						}
						return counter;
					}
				}

			}
			return counter;
		}

		return counter;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r1, c1, r2, c2;

		int T = input.nextInt();

		while (T < 1 || T > 50) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			r1 = input.nextInt();
			c1 = input.nextInt();
			r2 = input.nextInt();
			c2 = input.nextInt();

			while (r1 < 0 || r1 > 1000 || c1 < 0 || c1 > 1000 || r2 < 0 || r2 > 1000 || c2 < 0 || c2 > 1000) {
				if (r1 < 0 || r1 > 1000) {
					r1 = input.nextInt();
				}
				if (c1 < 0 || c1 > 1000) {
					c1 = input.nextInt();
				}
				if (r2 < 0 || r2 > 1000) {
					r2 = input.nextInt();
				}
				if (c2 < 0 || c2 > 1000) {
					c2 = input.nextInt();
				}

			}
			System.out.printf("Case %d: %d\n", i + 1, getNumberOfMoves(r1, c1, r2, c2));
		}
		input.close();

	}

}
