package com.chainsys.introduction;

public class DiamondPattern {

	public static void main(String[] args) {
		DiamondPattern();
	}

	public static void DiamondPattern() {

		int i, j, k, l;

		for (i = 1; i <= 9; i++) {

			for (j = 1; j <= 9 - i; j++) {
				System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		// bottom diamond pattern
		/*
		 * for (i = 4; i >= 1; i--) {
		 * 
		 * for (j = 0; j <= 4 - i; j++) { System.out.print(" "); } for (k = i; k >= 1;
		 * k--) { System.out.print(k); } for (l = 2; l <= i; l++) { System.out.print(l);
		 * }
		 * 
		 * System.out.println(); }
		 */

	}
}
