package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

class parent extends child{                   //parent class
	public int fun(int x){
		int Squre_x=x*x;
		return Squre_x;
	}
}
class child extends anonymous{                                  //child class
	public int fun1(int y){
		int Squre_y=y*y;
		return Squre_y;
}
}
class anonymous{
	public double radius(float d) {
		double r;
		r=d/2;
		return r;
	}
}
public class Inherit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		parent b=new parent();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter value of y:");
		int a=Integer.parseInt(br.readLine());
	    int s=b.fun1(a);                        //Returning Squre of y
	    System.out.println("Squre of y:"+s);
		System.out.println("enter value of x:");
		int p=Integer.parseInt(br.readLine());
	    int s1=b.fun(p);                         //Returning Squre of x
	    System.out.println("Squre of x:"+s1);
	    float d= 25.5f;
	    double r=b.radius(d);
	    System.out.println("Radius of the circle is: "+r);
	    
	}

}
