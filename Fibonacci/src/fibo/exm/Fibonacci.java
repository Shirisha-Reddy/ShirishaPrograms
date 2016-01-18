package fibo.exm;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
       System.out.print("enter number");
       int n=sc.nextInt();
       int count=1;
        int c=1,b=1,a=0;
       while(count<=n){
      
           c=b+a;
      System.out.print(c);
       a=b;
       b=c;
        
       count++;
       }
	}
}


	


