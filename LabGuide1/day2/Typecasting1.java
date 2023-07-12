package day2;

public class Typecasting1 {
	public static void main(String[] args) {
		int intVal = 10;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -128;
		byte sum = (byte) (max + min);
		
		System.out.println("Sum= " + sum);
	}
	
}
