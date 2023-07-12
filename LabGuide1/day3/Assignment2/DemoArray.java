package day3.Assignment2;

import java.util.Arrays;

public class DemoArray {
	public static void main(String[] args) {
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondtArrayMatrix[][] = {{2,2,2},{2,2,2}};
		
		System.out.println("matrix 1");
		for(int[] row : firstArrayMatrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("matrix 2");
		for(int[] row : secondtArrayMatrix) {
			System.out.println(Arrays.toString(row));
		}
		int[][] sumArray = new int [firstArrayMatrix.length][firstArrayMatrix[0].length];
		
		for(int i = 0;i < firstArrayMatrix.length;i++) {
			for(int j = 0;j < firstArrayMatrix[0].length;j++) {
				sumArray[i][j] = firstArrayMatrix[i][j] + secondtArrayMatrix[i][j];
			}
		}
		System.out.println("sum of the matrices");
		for(int[] row : sumArray) {
			System.out.println(Arrays.toString(row));
		}
		
	}
}
