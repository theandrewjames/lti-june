package day2.selfReview;

public class Switchcase {
 public static void main(String[] args) {
	String comment;
	int val = (int)(4 * 3);
	
	switch(val) {
	case 0: comment = "case 0";
			break;
	case 1: comment = "case 1";
			break;
	case 2: comment = "case 2";
			break;
	default: comment = "oops -- something is wrong";
	}
	System.out.println(comment);
}
}
