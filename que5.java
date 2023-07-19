package Day3Assignment;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower = 1, higher = 99999;

	    for(int number = lower + 1; number < higher; ++number) {
	      int digits = 0, result = 0;
	      int temp = number;

	      while (temp != 0) {
	    	  temp /= 10;
	        ++digits;
	      }

	      temp = number;

	      while (temp != 0) {
	        int remainder = temp % 10;
	        result += Math.pow(remainder, digits);
	        temp = temp/10;
	      }
	      
	      
	      if (result == number) 
	        System.out.print(number + " ");
	    }
	}

}
