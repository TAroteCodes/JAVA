package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i,a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter stopping no for even no.:");
		a=Integer.parseInt(br.readLine());
		for(i=2;i<=a;i=i+2) {
			System.out.println(i);
		}
		System.out.println("enter stopping no for odd no.:");
		b=Integer.parseInt(br.readLine());
		for(i=1;i<=b;i=i+2) {
			System.out.println(i);
		}

	}

}
