import java.util.Scanner;

public class student {
	int roll,marks;
	String name;
	public void setData() {
		System.out.println("name roll marks ");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		roll=sc.nextInt();
		marks=sc.nextInt();
		sc.close();
	}
	public void display() {
		System.out.println(name+" "+roll+" "+marks);
	}
}
