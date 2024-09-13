// write a java program to print simple exception. //
public class SimException 
{

    public static void main(String[] args) 
	{
        try {
			int x=10;
			int y=0;
			int z=x/y;
            }
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("you have 0 as divider for this program");
		}
	}
}