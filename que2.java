package Day3Assignment;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int count=1;
		
		for(int i=1;i<=6;i++) 
		{
			for(int j=1; j<=6-i; j++)
				
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
				
				if(count==10)
					count=0;
			}
			System.out.println();
	}
	}
}


