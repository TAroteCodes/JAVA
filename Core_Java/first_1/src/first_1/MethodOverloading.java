package first_1;
class opps{
	public static int cal(int x,int y)
	{
	 int plus;
	 plus=x+y;
	 return plus;
	}
	public static float cal(float a,int b)
	{
	 float subb;
	 subb=a-b;
	return subb;
	}
	public static String cal(String t)
	{
	 String a=t.toLowerCase();
	 return a;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		//int x,y,b; float a; 
		String g;
		System.out.println(opps.cal(10,5));
        System.out.println(opps.cal(50.0f,25));
        g=opps.cal("TUshAr");
        System.out.println(g);

	}

}
