package Day3Assignment;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=5;i++)
	     {
	    	 
	    	  
	     for(int j=1;j<=5-i;j++) 
	     {
	         System.out.print(" ");
	      }
	      
	     for(int j=1;j<=i;j++)
	     {
	    	if(j==1 || i==1)
	    	 System.out.print("*");
	    	else
	    		System.out.print(" ");
	    	
	     }
	     for(int j=i-1;j>=1;j--) {
	    	 if(j==1 || i==1)
		    	 System.out.print("*");
		    	else
		    		System.out.print(" ");
	     }
	     
	     
	     System.out.println();
	     
	    	 
	     }
	     for(int i=4;i>=1;i--)
	     {
	    	 
	    	  
	     for(int j=1;j<=5-i;j++) 
	     {
	         System.out.print(" ");
	      }
	     for(int j=1;j<=i;j++)
	     {
	    	 if(j==1 || i==1)
		    	 System.out.print("*");
		    	else
		    		System.out.print(" ");
	    	
	     }
	     for(int j=i-1;j>=1;j--) {
	    	 if(j==1 || i==1)
		    	 System.out.print("*");
		    	else
		    		System.out.print(" ");
	     }
	     
	     
	    	 
	     System.out.println();
	     }
	    
	}

}
