import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i = 0;i<=n; i++) {
			System.out.print(i+"\t");
			System.out.println((int)Math.pow(2,i));
		}
	}
}
