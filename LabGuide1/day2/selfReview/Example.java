package day2.selfReview;

public class Example {
 public static void main(String[] args) {
//	int intValOne = 0;
//	int intValTwo = 0;
//	for(short index = 0; index < 5;index++) {
//		if((++intValOne > 2) || (++intValTwo > 2)) {
//			intValOne++;
//		}
//	}
//	System.out.println(intValOne + " " + intValTwo);
	 
	 //------
//	 int intValOne = 5, intValTwo = 7;
//	 System.out.println((intValTwo * 2) % intValOne);
//	 System.out.println(intValTwo % intValOne);
	 //-------
	 int val1 = 9;
	 int val2 = 6;
	 for(int val3 = 0;val3 < 6; val3++,val2--) {
		 if(val1 > 2) {
			 val1--;
		 }
		 if(val1 > 5) {
			 System.out.println(val1 + " ");
			 --val1;
			 continue;
		 }
		 val1--;
	 }
}
}
