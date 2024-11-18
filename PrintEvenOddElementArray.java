
public class PrintEvenOddElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,5,6,7,8,9,10};
		
		int index=0;
		int[]b=new int [a.length];
		evenodd(a,index,b);
		
		
		
	}
	
	private static void evenodd(int[]a,int index,int[]b) {
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2==0) {
				
				b[index++]=a[i];
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
             if (a[i]%2!=0) {
				
				b[index++]=a[i];
				
			}
			
			
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] +" ");
			
		}
		
		
		
	}

}
