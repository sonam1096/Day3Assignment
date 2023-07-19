package Day3Assignment;
import java.util.*;
public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		   
		    Scanner sc = new Scanner(System.in);
		      System.out.print("Enter no of terms: ");
		      int num = sc.nextInt();
		      int start = sc.nextInt();
		      int  zero= 0;
		      int first = 1;
		          int fib =0;
		          int count =0;
		          
		         for (int i = 1; ; i++) {
		           fib=zero+first;
		           if(fib>=start) {
		           System.out.print(fib+" ");
		           count++;
		           
		           }
		              if(count==num) {
		                break;
		              }
		           zero=first;
		           first=fib;
		           }
		         }
		  
		 


	     }
 


