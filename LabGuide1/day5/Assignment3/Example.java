package day5.assignment3;

public class Example implements InterOne{

	@Override
	public void methodOne() {
		int varThree = varTwo + 10;
		System.out.println("value of varTwo:" + (varThree - 10));
		System.out.println("good morning");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("good afternoon");
	}

}
