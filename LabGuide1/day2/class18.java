package day2;

public class class18 {
	static int i = 22;
	static int j = 1400;
	static boolean k;
	static boolean l;
	public static void main(String[] args) {
		i = 22;
		j = 1400;
		class18 class1 = new class18();
		k = class1.Method1(i);
		l = class1.Method2(j);
		
		if(k == true && l == true) {
			System.out.println("is that a new employee");
		}
		else {
			System.out.println("is not a new employee");
		}
	}
	public boolean Method1(int i) {
		if(i > 20 && i < 30) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Method2(int j) {
		if(j >= 14000 && j < 20000) {
			return true;
		}
		else {
			return false;
		}
	}
}
