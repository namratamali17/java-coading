import java.util.Iterator;

public class InterleavingofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]a= {'a','b','c','d','e','f','g'};
		char[]b= {'w','x','y','z'};
		mycode(a,b);
		

	}
	private static void mycode(char[]a,char[]b) {

		char[]c=new char[a.length+b.length];
        int index=0;
        for(int i=0;i<c.length;i++)
        {
        	if(i<a.length)
        		c[index++]=a[i];
        	if(i<b.length)
        		c[index++]=b[i];
        		
        }
		
        for (int i = 0; i < c.length; i++) {
			
        
			System.out.println(c[i]+" "); 
		}
	}

}
