
public class Q4 {

	public static void main(String[] args) {
		int n1,n2,increment;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		increment=Integer.parseInt(args[2]);
		
		for(int i=n1;i<n2;i+=increment) {
			System.out.println(i);
		}

	}

}
