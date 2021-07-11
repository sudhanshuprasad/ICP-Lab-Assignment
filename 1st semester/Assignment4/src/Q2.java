
public class Q2 {

	public static void main(String[] args) {
		
		int n;
		n=Integer.parseInt(args[0]);
		int i=0;
		while (i<n) {
			
			int lastDigit=(i+1)%10;
			
			if(i==10)
				System.out.println("11th Hello");
			else if(i==11)
				System.out.println("12th Hello");
			else if(lastDigit==1)
				System.out.println(i+1+"st Hello");
			else if(lastDigit==2)
				System.out.println(i+1+"nd Hello");
			else
			System.out.println(i+1+"th Hello");
			
			i++;
		}

	}

}
