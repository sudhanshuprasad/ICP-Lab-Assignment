
public class Febonacci {
	public static void main(String args[]) {
		int num=0,n=10,a=0,b=1;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			num=a+b;
			a=b;
			b=num;
		}
	}
}
