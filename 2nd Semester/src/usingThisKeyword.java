class A{
	int x, y;
	A(int x) {
		this.x=x;
		System.out.println("hello");
	}
	
	A(int x, int y){
		this(x);
		this.y=y;
		System.out.println(x+" "+y);
	}
}
public class usingThisKeyword {

	public static void main(String[] args) {
		A a=new A(10,20);
	}

}
