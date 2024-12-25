//program for Singlethread
package threads1;

import java.util.Scanner;
class Data extends Thread{
	public void run() {
	for(int i=0;i<2;i++) {
		System.out.println("Dayyala Vamsi");
	    
	}
	}
}
public class SingleThread {

	public static void main(String[] args) throws InterruptedException{
	
		Scanner se=new Scanner(System.in);
		Data t=new Data();
		t.start();
		Thread.sleep(5000);

		System.out.println("task 1:addition operation started");
		System.out.println("enter the first number");
		int n1=se.nextInt();
		System.out.println("enter the second number");
		int n2=se.nextInt();
		int res=n1+n2;
		System.out.println(res);
		System.out.println("task1: addition operation is completed");
		System.out.println("task 2:printing operation started");
	
			
		System.out.println("task 2:printing operation completed");
		System.out.println("task 3:Banking operation started");
		System.out.println("enter the account number");
		int acc=se.nextInt();
		System.out.println("enter the pincode");
		int pin=se.nextInt();
		System.out.println("account details are added");
		System.out.println("task 3:Banking operation completed");
		

		
	}
	}
