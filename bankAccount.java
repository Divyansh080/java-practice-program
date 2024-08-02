import java.util.Scanner;


class bankAccount{

public static void main(String args[])
	{
	   
	   Scanner sc = new Scanner (System.in);
	   System.out.println("if you want to create a account in our bank,you must pay some deposite");
	   
	   int depo=50000;
	   System.out.println("your deposite is:"+depo);
	   
	   System.out.print("write a amount you want to widthDraw:");
	   int widthDraw= sc.nextInt();
	  
	   int currentSaving = depo-widthDraw;
	   System.out.println(" ");
	   System.out.println("your current Savings is:"+currentSaving);
		
	}

}