package first_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class swapp{                                   
    float redius; double area;
    public void set(float r){
        this.redius=r;
    }
    public double getarea1(){
    	
    area=3.147*redius*redius;
        return area;
    }
}

public class Getter_And_Setter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		float  a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter redius of circle:");
		a=Integer.parseInt(br.readLine());
		swapp c=new swapp();
	       c.set(a);
	        System.out.println(c.getarea1());
	}
}

