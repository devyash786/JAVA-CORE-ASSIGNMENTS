class RatQ13
{
 public static void main(String args[])
  { int m=1,i,x;
    x=Integer.parseInt(args[0]);
    for(i=1;i<=x;i++)
       {
         m=m*i;	   
	}
	System.out.println("Factorial of ::"+x+"::is::"+m);
}}