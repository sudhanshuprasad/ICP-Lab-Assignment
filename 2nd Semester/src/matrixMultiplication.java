import java.util.Scanner;

public class matrixMultiplication {

	public static double[][] matrixMultiply (double[][] mat1, double[][] mat2) {
		double [][]res=new double[2][2];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				res[i][j]=0;
				for (int k = 0; k < res.length; k++) {
					res[i][j]+=mat1[k][j]*mat2[i][k];
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		double [][]m1=new double[2][2];
		double [][]m2=new double[2][2];
		
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1[i][j]=sc.nextDouble();
			}
		}

		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2[i][j]=sc.nextDouble();
			}
		}
		sc.close();
		
		double ans[][]=matrixMultiply(m1, m1);
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
