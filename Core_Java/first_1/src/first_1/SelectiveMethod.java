package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class method1{
	public static void add(int x,int y)
	{
	 int plus;
	 plus=x+y;
	System.out.println("addition="+plus);
	}
	public static void radius(float r)
	{
	 double rad;
	 rad=3.14*r*r;
	System.out.println("radious="+rad);
	}
}

public class SelectiveMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x,y;
		float r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No. 1:");
		x=Integer.parseInt(br.readLine());
		System.out.println("Enter 2:");
		y=Integer.parseInt(br.readLine());
		System.out.println("Enter redius:");
		r=Integer.parseInt(br.readLine());
		
		method1.add(x,y);
		method1.radius(r);
	}

}
