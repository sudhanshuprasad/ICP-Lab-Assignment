import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		while (num/i!=1) {
			if(num%i==0) {
				System.out.print(i+",");
				num=num/i;
			}
			else {
				i++;
			}
		}
		System.out.print(num);
	}

}
