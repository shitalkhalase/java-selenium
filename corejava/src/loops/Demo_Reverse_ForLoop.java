package loops;   //using For Loop

public class Demo_Reverse_ForLoop
{

	public static void main(String[] args) 
	{
		int num = 1234567, reversed = 0;

	    for(;num != 0; num=num/10) 
	    {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println(reversed);
	  }
	
		
}


