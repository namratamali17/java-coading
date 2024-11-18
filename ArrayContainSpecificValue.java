import java.util.Iterator;

public class ArrayContainSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {33,7,90,20,5,50,40};		
		int ele=40;
		mycode(a,ele);
		
		
	}
	private static void mycode(int[]a,int ele) {
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==ele) {
				System.out.println("found");
				count++;
				
			}
		}
		if (count==0) {
			 
			 System.out.println("not found ...");
		}
	}

}
