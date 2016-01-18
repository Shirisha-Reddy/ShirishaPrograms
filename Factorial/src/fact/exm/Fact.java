package fact.exm;
import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
	      int a, n, fact = 1;

		  int factorialnum = Integer.parseInt(args[]);
	      if ( n < 0 )
	
	          System.out.println("enter a positive Number .");
	       else
	       {
	          for ( a = 1 ; a<= n ; a++ )
	             fact = fact*a;
	  
	          System.out.println("Factorial of "+n+" is = "+fact);
	       }
	}
}
	       






