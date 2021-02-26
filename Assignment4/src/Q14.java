import java.lang.Math;
public class Q14 {

	public static void main(String[] args) {
		int i=0, n = Integer.parseInt(args[0]);
		double ans = 0;
		
		while(i<n){
			if(ans>n) {
				ans = Math.pow(2, i-1);
				break;
			}else
			
			i++;
			ans = Math.pow(2, i);
		}
		
		System.out.println(ans);
	}

}
