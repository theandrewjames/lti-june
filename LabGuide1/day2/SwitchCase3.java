package day2;

public class SwitchCase3 {
 public static void main(String[] args) {
	char grade = 'B';
	
	switch(grade) {
	case 'A':
		System.out.println("80-100");
		break;
	case 'B':
		System.out.println("73-79");
		break;
 	case 'C':
		System.out.println("65-72");
		break;
 	case 'D':
		System.out.println("55-64");
		break;
 	case 'E':
		System.out.println("< 55");
		break;
	}
}
}
