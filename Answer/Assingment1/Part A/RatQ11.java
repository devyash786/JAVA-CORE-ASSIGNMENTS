class RatQ11
{
 public static void main(String args[])
  { int a=0,b=1;
    System.out.println(a);
	System.out.println(b);
    for(int i=1;i<=25;i++)
	  { int c=a+b;
        a=b;
        b=c;
       System.out.println(c);		
      }
	

   }
}