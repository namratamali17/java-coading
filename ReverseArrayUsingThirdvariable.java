
public class ReverseArrayUsingThirdvariable {

	
	public static void main(String [] args)
	
	{
	
		int a[] = {1,2,4,5,6,7,8};
		mycode(a);
		
		
	}
	
	private static void mycode(int[] a) {
		for (int i = a.length-1;i>=0; i--) { 
			System.out.print(a[i]+ "  ");
		}
	}
}


