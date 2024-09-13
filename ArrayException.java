// write a java program to print array index out of bound exception. //
public class ArrayException 
{

    public static void main(String[] args) 
	{
        try {
		/*	int x=10;
			int y=0;
			int z=x/y;*/
			
			int arr[] = {12,12};
			
			System.out.println(arr[2]);
            }
		catch(ArithmeticException a)
		
		{	System.out.println("-----------------");
			System.out.println("exception:" +a);
			System.out.println(" ");
			System.out.println("you have 0 as divider in this program");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("-----------------");
			System.out.println("exception:" +e);
			System.out.println(" ");
			System.out.println("array index out of bound");
		}
	}
}