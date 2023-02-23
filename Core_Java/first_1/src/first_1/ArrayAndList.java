package first_1;

import java.util.ArrayList;

public class ArrayAndList {

	public static void main(String[] args) {
		int[] ar= {2,4,6,8,10};          //creating int type array
        System.out.println(ar.length);   //finding out length of array
        System.out.println(ar[1]);
        
        ArrayList<String> arr= new ArrayList<String>(); //creating array list
        arr.add("jan"); arr.add("feb"); arr.add("mar");  //adding element
        arr.add(1, "apr");                               //replaced element
        System.out.println(arr);                         //print array
        arr.remove(3);                                   //removed element
        System.out.println(arr);                         //printed array again
	}

}
