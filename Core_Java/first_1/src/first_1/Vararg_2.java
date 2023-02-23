package first_1;

public class Vararg_2 {                     //find length of array
	public int len(int ...arr) {
		int i1=0;
		for (int i=1;i<=arr.length;i++) {
			i1=i*1;
		}
		return i1;
	}

	public static void main(String[] args) {
		Vararg_2 v=new Vararg_2();
		int a=v.len(1,2,3);
		System.out.println("length of array:"+a);
		

	}

}
