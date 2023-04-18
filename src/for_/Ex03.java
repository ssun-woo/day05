package for_;

public class Ex03 {

	public static void main(String[] args) {

		int n1, n2;
		for (n1 = 1; n1 < 5; n1++) {
			for (n2 = 1; n2 < 5; n2++) {
				System.out.println("n1 : " + n1 + ", n2 : " + n2);
			}
		}

		/*
		 * 2 * 1 = 2 2 * 2 = 4 ... 9 * 9 = 81
		 */

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");

				if (j == 9) {
					System.out.print("\n");
				}
			}
		}

		System.out.println();

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				if (j == 9) {
					System.out.println();
				}
			}

		}
	}
}
