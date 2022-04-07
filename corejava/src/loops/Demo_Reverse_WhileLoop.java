package loops;   //using while loop

class Demo_Reverse_WhileLoop {
	  public static void main(String[] args) {

	    int num = 123456789,rem,reversed = 0;
	    while(num != 0)
	    {
	    	int digit = num % 10;
	      reversed = reversed * 10+ digit;
	      num=num/10;
	    }

	    System.out.println(reversed);
	  }
	}