package day2;

public class PassByVal7 {
 public static void main(String[] args) {
	int sId = 25;
	PassByVal7 val = new PassByVal7();
	System.out.println(sId);
	val.passTheValueMethod(sId);
	System.out.println("The sId are" + sId);
}
	 public void passTheValueMethod(int sId) {
		 sId = 10;
		 System.out.println("The sId are" + sId);
	 }
	}
