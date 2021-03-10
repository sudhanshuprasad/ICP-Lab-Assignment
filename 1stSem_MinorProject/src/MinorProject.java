import java.util.Scanner;

public class MinorProject {
	
	public static String uniqueNum(String num) {
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
		
		return unique_num;
	}
	
	public static String replaceDuplicate(String num) {
		
		for(int i=0;i<num.length();i++) {
			
			String newnum="";
			
			for(int j=0;j<num.length();j++) {
				if(i!=j && num.charAt(i)==num.charAt(j)) {
					newnum+="*";
				}
				else {
					newnum+=num.charAt(j);
				}
			}
			
			num=newnum;
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		sc.close();
		
		System.out.println(replaceDuplicate(num));
		System.out.println(uniqueNum(num));
	}

}