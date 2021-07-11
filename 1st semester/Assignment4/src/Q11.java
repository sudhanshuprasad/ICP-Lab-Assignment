
public class Q11 {
	public static void main(String[] args) {
		int sqsum=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			sqsum+=i*i;
		}
		System.out.println(sum*sum-sqsum);
	}
}
