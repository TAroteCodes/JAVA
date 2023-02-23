package first_1;

import java.util.Scanner;

class cls{                                       //custon class
	String MyName; String regex="^[a-zA-Z]+$";     //regex is to check validation
	public void set(String name){
        if (name.matches(regex)){
            this.MyName=name;
        }else {
            System.out.println("wrong name set");
        }
    
}
	public String get_Name(){
        return MyName;
     }
}

public class ValidationUsingGetter_Setter {

	public static void main(String[] args) {
		cls c=new cls();
		@SuppressWarnings("resource")
		Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Your Name:");
	    String a= myObj1.nextLine();
	       c.set(a);
	        System.out.println(c.get_Name());
	}

}
