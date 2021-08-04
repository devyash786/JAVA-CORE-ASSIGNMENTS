class RatQ9
 { 
   public static void main(String args[])
     { int i,j,k,c=15;;
	   for(i=1;i<=5;i++)
	   {
	     for(j=1;j<=6-i;j++)
		  { 
		    System.out.print(" "+(c--));
		  }
		  for(k=5;k>6-j;k--) 
		   System.out.print(" ");
		  System.out.println(); 
		}
     }
}
	 