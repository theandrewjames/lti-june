package SelfReview;

public  class Cat extends Animal{
	public static void testClassMethod() {
		System.out.println("the class method in cat");
	}
	private void testInstanceMethod() {
		System.out.println("the instance method in cat");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
	}
}
