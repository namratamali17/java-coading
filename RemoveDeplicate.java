
public class RemoveDeplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,5,6,2,3,1,13,4,3,5,6};
		
		mycode(a);
		
	}
 private static void mycode(int[]a) {
	
	 
	     int c=0;
	     for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					c++;
					break;
					
				}
			}
		}
	     
	     int[] b=new int [a.length-c];
	     int ind=0;
	     for (int i = 0; i < a.length; i++) {
	    	 c=0;
	    	 for (int j = 0; j <i; j++) {
	    		 if(a[i]==a[j])
	    		 {
	    			 c++;
	    			 
	    		 }
					
		}
	    	 if(c==0)
	    	 {
	    		 b[ind++]=a[i];
	    	 }
	    	 }
	     
	     
	     for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + "  ");
		}
	    	 
	     
	     
	     
	     
	     
}
}
