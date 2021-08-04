class RatQ12
{
 public static void main(String args[])
  { int c=0,count=0;
    for(int i=2;i<=1000;i++)
	  {
	    for(int j=1; j<=i/2;j++)
		   {
		     if(i%j==0)
			   count++;
		   } 
        if(count==1)
         {
       		System.out.println(i);
			c++;
		}
		count=0;
       if(c==100)
       {System.out.println("100 Prime  number");
	   break;} 	   
	}
}}