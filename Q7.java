import java.util.*;
public class Prime
{
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		return true;
		else
		return false;
		
	}
  
    public static int nthPrime()
    {
    	int count=1; // counting 2 as prime
    	for(int i=3;;i+=2)
    	{
    		if(isPrime(i))
    		{
    			count++;
    		}
    		if(count==10001)
    		return i;
    	}
    }
        
   public static void main(String[] args) {
        System.out.println(nthPrime());
    }
}
    
