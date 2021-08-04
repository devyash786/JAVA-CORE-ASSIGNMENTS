class RatQ10
{
 public static void main(String args[])
  { int sum=0,sum1=0;
    for(int i=1;i<=200;i++)
	  { if(i%2==0) 
		sum+=i;
	   else 
         sum1+=i;	   
	}
	System.out.println("Sum of First even 100nos is::"+sum);
	System.out.println("Sum of First odd 100nos is::"+sum1);
   }
}