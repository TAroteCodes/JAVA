package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i=1,r,m;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No. of Whitch table you want:");
		r=Integer.parseInt(br.readLine());
		do {
			m=i*r;
			System.out.println(m);
			i++;
			}
        while(i<=10);
	}

}
