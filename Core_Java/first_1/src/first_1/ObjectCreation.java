package first_1;
class assg{
public void add(int x,int y)
{
 int plus;
 plus=x+y;
System.out.println("addition="+plus);
}
public void sub(int x, int y) {
	int subb;
	subb=x-y;
	System.out.println("Substraction="+subb);
}
public int mul(int x, int y) {
	int m;
	m=x*y;
	return m;
}
public int div(int x,int y) {
	int d;
	d=x/y;
	return d;
}
}

public class ObjectCreation {

	public static void main(String[] args) {
		assg ob=new assg();
		ob.add(5, 10);
		ob.sub(60,35);
		System.out.println("multiplication="+ob.mul(18, 18));
		System.out.println("division="+ob.div(333, 11));
		
		

	}

}
