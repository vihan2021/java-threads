//program for interthread communication
package threads2;
class Communicate implements Runnable{
	 static int c = 1;
	    Object obj = new Object();

	     @Override
	     public void run() {
	         try{
	             while (c<=10){
	                 synchronized (obj){

	                 if(c%2==0 && Thread.currentThread().getName().equals("Even")){
	                          System.out.println("Thread name : "+Thread.currentThread().getName()+"Value : "+c);
	                         Thread.sleep(2000);
	                         c++;
	                         obj.notify();
	                         obj.wait();
	                     
	                 }else if(c%2!=0 && Thread.currentThread().getName().equals("Odd")){
	                     
	                         System.out.println("Thread name: "+Thread.currentThread().getName()+"Value: "+c);
	                         Thread.sleep(2000);
	                         c++;
	                         obj.notify();
	                         if (c <= 10) { // Avoid unnecessary waiting at the end
	                             obj.wait();
	                         
	                     }
	                 }
	             }

	         }
	                 
	         }catch (InterruptedException e){
	             e.printStackTrace();
	         } finally {
	        	 System.out.println("I have done it");
	         }

	         }   
	 }


	public class Interthreadcom {
	    public static void main(String[] a){
	    	Communicate  oe = new Communicate();
	Thread t1 = new Thread(oe);
	Thread t2 = new Thread(oe);
	t1.setName("Even");
	t2.setName("Odd");
	t1.start();
	t2.start();
	    }
	}
