package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int s1,s2,s3,s4,s5;
		double a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the Marks of Subject1:");
		s1=Integer.parseInt(br.readLine());   
		System.out.println("enter the Marks of Subject2:");
		s2=Integer.parseInt(br.readLine());
		System.out.println("enter the Marks of Subject3:");
		s3=Integer.parseInt(br.readLine());
		System.out.println("enter the Marks of Subject4:");
		s4=Integer.parseInt(br.readLine());
		System.out.println("enter the Marks of Subject5:");
		s5=Integer.parseInt(br.readLine());
		a=(s1+s2+s3+s4+s5)/5;                                  //finding out avgerage
		System.out.println("Average of your marks is =\n "+a);
		if (a>=90) {                                           //if condition
			System.out.println("you get bicycle");
		}
		else if (a>=70 && a<90) {                             //nested if else
			System.out.println("You will get Chocolate");
		}
		else{
			System.out.println("You have to Study Hard");
		}

	}

}
