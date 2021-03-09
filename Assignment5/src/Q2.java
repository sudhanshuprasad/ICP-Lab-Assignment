import java.util.Scanner;

public class Q2 {
	public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,n=sc.nextInt();
		sc.close();
		for (int i = 0;i<=n; i++) {
			if(n<=40) {
				count++;
			}
		}
		System.out.print(count);
	}
}
