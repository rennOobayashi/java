package week6;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		//Implementing a two dimensional array using a one dimensional array
		int[][] math = new int[2][3];
		
		//Array handling
		//rows: outside for method
		//cols: inside  for method
		for (int x = 0; x < math.length; ++x) {
			for (int y = 0; y < math[x].length; ++y) {
				System.out.printf("math[%d][%d]: %d\r\n", x, y, math[x][y]);
				//math[x][y] = (int)(Math.random() * 100);
			}
			System.out.println();
		}
		
		//for(var x : math) {
		int cntX = 0;
		int cntY = 0;
		for (int[] x : math) {
			for (int y : x) {
				System.out.printf("math[%d][%d]: %d\r\n", cntX, cntY++, y);
			}
			++cntX;
			cntY = 0;
			System.out.println();
		}
		System.out.println();
		
		//Two dimensional array are created based on rows
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		
		for (int x = 0; x < engScores.length; ++x) {
			for (int y = 0; y < engScores[x].length; ++y) {
				System.out.printf("engScores[%d][%d]: %d\r\n", x, y, math[x][y]);
			}
			System.out.println();
		}
		System.out.println();
		
		//Copy array 1
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[7];
		
		for (int i = 0; i < arr1.length; ++i) {
			arr2[i] = arr1[i];
		}
		
		int cnt = 0;
		for (var i : arr2) {
			System.out.printf("arr2[%d]: %d\r\n", cnt++, i);
		}
		System.out.println("\r\n");
		
		//Copy array 2 (use System.arraycopy)
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		cnt = 0;
		for (var i : arr2) {
			System.out.printf("arr2[%d]: %d\r\n", cnt++, i);
		}
		System.out.println();
		
		//Copy array 3 (use array class)
		//If the size of array being copied exceeds the size of
		//the array, it is automatically allocated to the default value
		arr2 = Arrays.copyOf(arr1, 7);

		cnt = 0;
		for (var i : arr2) {
			System.out.printf("arr2[%d]: %d\r\n", cnt++, i);
		}
		System.out.println();
	}
}
