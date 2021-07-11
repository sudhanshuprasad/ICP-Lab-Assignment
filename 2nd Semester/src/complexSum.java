class complex{
	int real,imag;
	void setData(int r, int i) {
		real=r;
		imag=i;
	}
	complex addComplex(complex c1, complex c2) {
		complex c3=new complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		//System.out.println(c3.real+"+"+c3.imag+"i");
		return c3;
	}
}

public class complexSum {

	public static void main(String[] args) {
		complex c=new complex();
		complex c1=new complex();

		c.setData(3, 4);
		c1.setData(4, 5);
		c1=c.addComplex(c, c1);
		System.out.println(c1.real+"+"+c1.imag+"i");
	}

}
