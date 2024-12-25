//program for threads(ex:Operations)
package threads1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Operations extends Thread{
	public void run()
	{
		if(Thread.currentThread().getName().equals("Add")) {
			Add();
			
		}
	
	else if(Thread.currentThread().getName().equals("Print")) {
		Print();
	}
	else {
		Bank();
		
	}
	}
	public void Add()
	{
		try {
			Scanner se=new Scanner(System.in);

			System.out.println("task 1:addition operation started");
			System.out.println("enter the first number");
			int n1=se.nextInt();
			System.out.println("enter the second number");
			int n2=se.nextInt();
			int res=n1+n2;
			System.out.println(res);
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException  e2)
		{
			e2.printStackTrace();
		}
		
		}
	public void Print()
	{
		try {
			Scanner se=new Scanner(System.in);
		
			System.out.println("task 2:printing operation started");
			for(int i=0;i<5;i++) {
				System.out.println("GTEC TAINS BANGOLORE");
				Thread.sleep(2000);
			}
				System.out.println("task 2:printing operation completed");
			}
		
			catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		}
		public void Bank()
		{
			try {
				Scanner se=new Scanner(System.in);
				System.out.println("task 3:Banking operation started");
				System.out.println("enter the account number");
				int acc=se.nextInt();
				System.out.println("enter the pincode");
				int pin=se.nextInt();
				System.out.println("account details are added");
				System.out.println("task 3:Banking operation completed");	
				
			}
			catch(ArithmeticException e1) {
				e1.printStackTrace();
			}
			catch(InputMismatchException  e2)
			{
				e2.printStackTrace();
			}
			
		}
}
	

public class MultiThread {

	public static void main(String[] args) throws InterruptedException{
		Operations op1=new Operations();
		Operations op2=new Operations();
		Operations op3=new Operations();

		op1.setName("Add");
		op2.setName("Print");
		op3.setName("Bank");
		op1.start();
		op2.start();
		op3.start();
	}
}

