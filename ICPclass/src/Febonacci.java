
public class Febonacci {
	public static void main(String args[]) {
		int num=0,n=10,t0=0,t1=1;
		for(int i=0;i<n;i++) {
			System.out.print(t0+" ");
			num=t0+t1;
			t0=t1;
			t1=num;
		}
	}
}
