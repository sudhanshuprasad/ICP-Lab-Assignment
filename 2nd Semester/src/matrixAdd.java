
public class matrixAdd {
	private static int[][] matAdd(int mat1[][], int mat2[][]) {
		int matAns[][]= {{0,0,0},{0,0,0},{0,0,0}};
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				matAns[i][j]+=mat1[i][j]+mat2[i][j];
			}
		}
		return matAns;
	}
	public static void main(String[] args) {
		int [][]mat1=new int[3][3];
		int [][]mat2=new int[3][3];
				
		matAdd(mat1, mat2);
		}

}
