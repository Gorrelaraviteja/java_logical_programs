import java.util.*;
class Big
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=16;
		int b=12;
		int c=13;
		if(a>b)
		{
			System.out.println("a is big"); 
	    }		
        if(a>c)
        {
	          System.out.println("a is big");
	    }     
          else if(b>a)
        {
           System.out.println("b is big");
		}
		else if (b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}
	
	}
}
