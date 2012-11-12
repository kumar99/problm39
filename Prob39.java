class Prob39
{
    public static boolean right(int i, int j, int k)
	{
        return i * i + j * j == k * k;
  	}
    public static void main(String[] args) 
	{
    	    int max_tri = 0, max_peri = 0;
            
	    for(int p = 3; p <= 1000; p++) 
		{
            	     int t = 0;
            		
		     for(int i = 1; i < p - 1; i++) 
			{
                	    for(int j = 1; j < p - i; j++) 
				{
  		                  int k = p - i - j;
                    		  if(right(i, j, k) || right(j, i, k) || right(i, k, j))
                        	  t++;
                		}
            		}
            	if(t > max_tri) 
		    {
                	max_tri = t;
                	max_peri = p;
	            }
        	}
        System.out.println(max_peri);
    	}
}
