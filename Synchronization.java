//program for Synchronization
package threads2;

class Warrior extends Thread{
	String res1="AK47";
	String res2="M416";
	String res3="AWM";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Student1")) {
			Student1ACQ();
		}
		else {
			Student2ACQ();
			
			
		}
	}
	public void Student1ACQ() {
		try {
			synchronized(res2){
				System.out.println("Student1 Acquired the resource:"+res1);
				Thread.sleep(3000);
				synchronized(res1){
					System.out.println("Student1 Acquired the resource:"+res2);
					Thread.sleep(3000);
			synchronized(res3){
						System.out.println("Student1 Acquired the resource:"+res3);
						Thread.sleep(3000);
							
				
			}//release of resource:3
		}//release of resource:2
	}//release of resource:1
			
}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}
	public void Student2ACQ() {
		try {
			synchronized(res3){
				System.out.println("Student2 Acquired the resource:"+res3);
				Thread.sleep(3000);
		    synchronized(res2){
					System.out.println("Student2 Acquired the resource:"+res2);
					Thread.sleep(3000);
			synchronized(res3){
						System.out.println("Student2 Acquired the resource:"+res1);
						Thread.sleep(3000);
							
				
			}//release of resource:1
		}//release of resource:2
		 
	} //release of resource3
			
}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}
}

public class Sysnchronisedm {

	public static void main(String[] args) {
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		
		//Thread t1=new Thread(h1);while we using interface then we create thread class object (this code is for class)
		//Thread t2=new Thread(h2);
		//Thread t3=new Thread(h3);
		w1.setName("Student1");
		w2.setName("Student2");
		//h3.setName("others");
		w1.start();
		
		w2.start();
		

	}

}
