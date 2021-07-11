
public class Deletion_from_array {

	public static int delete(int a[], int size, int index) {
		for (int i = index; i < size-1; i++) {
			a[i]=a[i+1];
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		delete(a, 5, 2);
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}

	}

}
