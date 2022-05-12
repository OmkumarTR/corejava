package com.chainsys.firstTest;
/**
 * @author omku3118 - Omkumar
 * Date - 30-03-2022
 * Question : Pattern
 * .....1
.......212
......32123
.....4321234
....543212345
...65432123456
..7654321234567
.876543212345678
98765432123456789
 */
public class Triangle {

	public static void main(String args[]) {
		DiamondPattern();
	}

	public static void DiamondPattern() {

		int i, j, k, l;

		for (i = 1; i <= 9; i++) {

			for (j = 1; j <= 9 - i; j++) {
				System.out.print(".");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
