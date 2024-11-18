
public class ListOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {3,7,90,20,5,40,50};
       int k=3;
       mycode(a,k);
       
	}
	
	private static void mycode(int[]a,int k) {
		
		int index=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k; i++) {
		
			int sum=0;
			for (int j = i; j <i+k; j++) {
				
				sum=sum+a[j];
			}
			if (sum<min) {
				
				min=sum;
				index=i;
				
			}
			
			
		}
		int av=min/k;
		System.out.println(+av);
		System.out.println(+index);
		
		
		
	}

}
