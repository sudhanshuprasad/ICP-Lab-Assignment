import java.util.Scanner;

public class Q1 {
	
	public static int additionSimple(int a, int b) {
		return a+b;
	}
	public static int multiplicationSimple(int a, int b) {
		return a*b;
	}
	public static int subtractionSimple(int a, int b) {
		return a-b;
	}
	public static int divisionSimple(int a, int b) {
		return a/b;
	}
	public static int remainderSimple(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("addition= "+additionSimple(a, b));
		System.out.println("subtraction= "+subtractionSimple(a, b));
		System.out.println("multiplication= "+multiplicationSimple(a, b));
		System.out.println("division= "+divisionSimple(a, b));
		System.out.println("remainder= "+remainderSimple(a, b));
	}

}
