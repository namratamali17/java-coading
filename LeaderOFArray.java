import java.util.Iterator;

public class LeaderOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {10,16,144,15,13,5};
      myCode(a);
      
	}
	private static void myCode(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
				
					count++;
					break;
			
				}
			}
			if (count==0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
