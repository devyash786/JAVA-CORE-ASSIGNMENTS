class RatQ5
{
 public static void main(String args[])
  {
    int a=(int)(Math.random()*100);
	int b=(int)(Math.random()*100);
	int c=(int)(Math.random()*100);
	System.out.println("a="+a+","+"b="+b+","+"c="+c);
	int r= a>b?(a>c?a:c):(b>c?b:c);
	System.out.println("Maximum is :::"+r);

   }
}