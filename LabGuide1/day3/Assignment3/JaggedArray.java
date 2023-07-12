package day3.Assignment3;

import java.util.Arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		String jaggedArray[][] = {{"Tony", "JAVA", "C", "C++"}, 
				{"Thomas", "JAVA", "UNIX"}, {"Dinil", "Linux", "Oracle"}, 
				{"Delvin", "RDBMS", "C#", "Oracle"}};
		
		for(int i = 0;i < jaggedArray.length;i++) {
			for(int j = 0;j < jaggedArray[i].length;j++) {
				if(jaggedArray[i][j].equals("Delvin")) {
					System.out.println(Arrays.toString(jaggedArray[i]));
				}
			}
		}
	}
	
}
