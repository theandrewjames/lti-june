package SelfReview;

public class Testcount implements Count{
	public static void main(String[] args) {
		Testcount test = new Testcount();
		test.countUp();
	}
	@Override
	public void countUp() {
		for(int x =6;x>counter;x--,++counter) {
			System.out.println(" "+counter);
		}
		
	}

}
