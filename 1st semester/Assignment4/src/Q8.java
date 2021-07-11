
public class Q8 {

	static void Q8(int n, String s, int i) {
		if (i>n) {
			return;
		}
		System.out.println(s+i+s);
		Q8(n, s+i+s, i+1);
	}
	
	public static void main(String[] args) {
		
		Q8(15,"",1);
	}

}
