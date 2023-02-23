package first_1;

public class vararg {           //vararg is mainly use to feed multiple data 
	public int prod(int ...arr) {
		int pro=1;
		for (int i=0;i<arr.length;i++) {
			 pro =pro*arr[i];
			 System.out.println(pro);

		}
		return pro;
	}

	public static void main(String[] args) {
		vararg v=new vararg();
		int a=v.prod(2,3);
		System.out.println(a);

	}

}
