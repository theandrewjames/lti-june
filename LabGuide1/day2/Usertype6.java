package day2;

public class Usertype6 {
	String name;
	
	Usertype6(String paramterVal){
		name = paramterVal;
	}
	Usertype6(){
		this("student");
	}
	public static void main(String[] args) {
		Usertype6 usertype1 = new Usertype6("Faculty");
		Usertype6 usertype2 = new Usertype6();
		
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);
	}
}
