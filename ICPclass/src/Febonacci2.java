
public class Febonacci2 {
	public static void main(String[] args) {
		int a=0,b=1,i=0,n=10;
		while(i<n) {
			System.out.print(a+" "+b+" ");
			a=a+b;
			b=a+b;
			i+=2;
		}
	}
}
