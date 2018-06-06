package var2;

import java.util.Scanner;

/**
 * The task: 2. Print the numbers from 1 to k as a matrix N x N from left to
 * right and from top to bottom.
 **/

public class MatrixBuilding {

	public static int getSquareArrayLenth(int k) {
		int m = (int) Math.sqrt(k);
		if (m * m == k)
			return m;
		else
			return m + 1;
	}

	public static int[] getSquareArray(int k, int reset) {
		int[] squareArray = new int[reset * reset];
		for (int i = 1, j = 0; i <= k; i++, j++)
			squareArray[j] = i;
		return squareArray;
	}

	public static void getSquareMatrix(int[] array, int reset) {
		int y = 1;
		for (int i = 0; i < array.length; i++) {
			if (i % reset == 0)
				System.out.printf("\n\t", y++);
			System.out.printf(array[i] + " \t");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("puts parameter k");
		int k = Integer.parseInt(scan.next());
		scan.close();
		int reset = getSquareArrayLenth(k);
		int[] ar = getSquareArray(k, reset);
		getSquareMatrix(ar, reset);

	}

}
