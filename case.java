class Cases
{
	public static void main(String args[])
    	{
    		char c='b';
       		int d=(int)(c);
        		System.out.println(d);
        		if(d>=65)
       		 {
        			if(d<=90)
            			{
            				d=d+32;
            			}
       		 
      		 else if(d>=97)
           		 {
            			if(d<=122)
                		{
				d=d-32;
			}
		}
		}
		
		System.out.println("case changes to: "+(char)(d));
                }
}
        
        