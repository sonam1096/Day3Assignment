package Day3Assignment;

public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
//		public class NumberPattern {
//		    public static void main(String[] args) {
//		        String S = "";
//		        int count = 1;

		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
//		                S += count % 2;
//		                count++;
//
//		                if (i == j && i != 6) {
//		                    S += '\n';
//		                }
//		            }
//
//		            if (i % 2 == 0) {
//		                count = 1;
//		            } else {
//		                count = 0;
//		            }
		            	
		            	if((i+j)%2==0)
		            		System.out.print("1");
		            	else
		            		System.out.print("0");
		        }

		        System.out.println();
//		    }
		}

		
		
	}

}
