import java.util.Scanner;

public class swapnum {
	public static void reverse(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" "+b);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt();
		reverse(num1,num2);
	}

}
