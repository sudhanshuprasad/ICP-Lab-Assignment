import java.util.Scanner;

public class diagonalSum {

	public static void main(String[] args) {
		int [][]mat=new int[3][3];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		//input
		for (int i = 0; i < mat.length; i++) {
			for (int j= 0; j < mat.length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		//diagonal1
		for (int i = 0; i < 3; i++) {
			sum+=mat[i][i];
		}
		System.out.println(sum);
		
		//diagonal2
		sum=0;
		for (int i = 0; i < 3; i++) {
			sum+=mat[2-i][2-i];
		}
		System.out.println(sum);
		
	}

}
