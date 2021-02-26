
public class Q7 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum=0;
		for (int i = 0; i < n; i++) {
			double random=Math.random();
			sum=sum+random;
			System.out.print(random+" ");
		}
		System.out.print("\n"+sum/n);

	}

}
