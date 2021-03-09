import java.util.Scanner;

public class MinorProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		sc.close();
		int length=num.length();
		String unique_num="";
		
		for(int i=0;i<length;i++) {
			boolean unique=true;	
			for(int j=0;j<length;j++) {
				if(i!=j && num.charAt(j)==num.charAt(i)) {
					unique=false;
				}
			}
			
			if(unique) {
				unique_num+=num.charAt(i);
			}
		}
		
		System.out.print(unique_num);
		
	}

}
