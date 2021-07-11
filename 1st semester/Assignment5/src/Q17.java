import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double g1,g2,n;
		n=sc.nextDouble();
		sc.close();
		g2=n/2;
		do {
			g1=g2;
			g2=(g1+(n/g1))/2;
		}while(Math.abs(g1-g2)>0.001);
		System.out.println(g2);
	}

}
