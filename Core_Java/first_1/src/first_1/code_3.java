package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_3 {
// user input values (dynamic values)
	public static void main(String[] args) throws NumberFormatException, IOException {
		int i,j;   //declaration of variable
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //user input
		System.out.println("enter the value of i:");
		i=Integer.parseInt(br.readLine());
		System.out.println(i);
		System.out.println("enter the value of j:");
		j=Integer.parseInt(br.readLine());
		System.out.println(j);
		int sum,subb,mul,div;
		sum=i+j;
		subb=i-j;
		mul=i*j;
		div=i/j;
		System.out.printf(" sum=%d \n sub=%d \n mul=%d \n Div=%d",sum,subb,mul,div);
		
		
		
	}

}
