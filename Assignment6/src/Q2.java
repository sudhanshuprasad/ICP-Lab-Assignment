
public class Q2 {
	public static int pentagonalNumber(int n){
		return n*(3*n-1)/n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%11==0) {
				System.out.println("");
			}
			System.out.print(pentagonalNumber(i)+"\t");
		}
	}

}
