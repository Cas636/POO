package src;

public class Adicion {

	public static void suma(int a, int b) {
		System.out.println(a+b);
	}
	public static void suma(float a, float b) {
		System.out.println(a+b);
	}
	public static void main(String arg[]) {
		int num1 ,num2;
		float num3, num4;
		num1=5;
		num2=10;
		num3=5.5f;
		num4=5.6f;
		
		suma(num1,num2);
		suma(num3,num4);
	}
}
