package first_1;
class arithmatic{
	public static void add(int x,int y)
	{
	 int plus;
	 plus=x+y;
	System.out.println("addition="+plus);
	}
	public static void sub(int x, int y) {
		int subb;
		subb=x-y;
		System.out.println("Substraction="+subb);
	}
	public static int mul(int x, int y) {
		int m;
		m=x*y;
		//System.out.println("Multiplication="+m);
		return m;
	}
	public static int div(int x,int y) {
		int d;
		d=x/y;
		return d;
	}
}

public class UserDefinedMethod {

	public static void main(String[] args) {
		int c,f;
		arithmatic.add(25,5);
		arithmatic.sub(25,5);
		c=arithmatic.mul(5,5);
		System.out.println("Multiplication="+c);
		f=arithmatic.div(50,5);
		System.out.println("Division="+f);
	}

}
