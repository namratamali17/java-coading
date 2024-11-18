import java.util.Iterator;

public class RemoveDublicateUniqueCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {2,1,5,4,3,2,1,6,4,2};
		mycode(a);

	}
	private static  void mycode(int[] a) 
	{
	
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			
			for (int j = 0; j < i; j++) {
				if (a[i]==a[j]) {
					count++;	
				}
				if (count==0) {
					cnt++;
					
				}
			
				
				  System.out.println("new array"  +cnt );
				
			}
			
			
		}
	}

}
