package sum.exm;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum,n,temp;
        sum=0;
        n=100;

        while(n<=200)
        {
              temp=n%7;
             if (temp==0)
             {
                sum=sum+n;
             }
            n++;
       }
   System.out.println("Sum of all integers  between 100 and 200 &divisible by 7 is:"+sum);
	}
}
