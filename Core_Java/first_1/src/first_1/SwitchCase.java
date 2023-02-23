package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your age:");
		a=Integer.parseInt(br.readLine());
		if (a>60) {
			b=4;
			
		} else if(a==60) {
			b=1;
		} else if(a>=25 && a<=60) {
			b=2;
		}else if (a>=10 && a<=24) {
			b=3;
		}
		switch (b) {
		case (1):
			System.out.println("Time to Retirement");
		break;
		case(2):
			System.out.println("time to work hard");
		break;
		case(3):
			System.out.println("Study Hard");
		break;
		case(4):
			System.out.println("Enjoy Remaining life");
		break;
		default:
			System.out.println("Enjoy the Childhood");
		
		}

	}

}
