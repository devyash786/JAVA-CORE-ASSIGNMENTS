class RatQ8
{
 public static void main(String args[])
  {int i,j,k;
  for(i=1;i<=3;i++)
    { for(j=1;j<=2*i-1;j++)
	    System.out.print(" * ");
	   for(k=2*i;k<=5;k++)
	    System.out.print(" ");
	   System.out.println();
	 }
   for(i=1;i<=2;i++)
     {
	   for(j=1;j<=5-(2*i);j++)
	    System.out.print(" * ");
	   for(k=j;k<=5;k++)
	    System.out.print(" ");
	   System.out.println(); 
	  }
	  
	   
	}
 }	
  