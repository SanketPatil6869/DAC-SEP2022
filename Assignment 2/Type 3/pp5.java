class pp5{

public static void main(String args[]){

   for(int i=9;i>=1;i--)
   {
	 for(int k=1;k<=i;k++)
		 
	 {
	  System.out.print("  "); 
	 }		  
	   
     for(int j=i;j<=9;j++)
	 {
	 System.out.print(j+" ");
     }
	 
	 
	for(int  j=8;j>=i;j--)
	 {	
     System.out.print(j+" ");
	  
	 }
	    
	 System.out.println();
   
   }
  
}
}