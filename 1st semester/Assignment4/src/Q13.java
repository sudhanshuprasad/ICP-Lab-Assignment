
public class Q13 {

	public static void main(String[] args) {
		int sum=0,n = Integer.parseInt(args[0]);
		
		while(n!=0) {
			System.out.print(n%10+" ");
			sum += n%10;
			n=n/10;
		}
		System.out.println("\nsum = "+sum);
		if(sum%9==0) {
			System.out.println("divisible");
		}
		else {
		System.out.println("not divisible");	
		}
	}

}
