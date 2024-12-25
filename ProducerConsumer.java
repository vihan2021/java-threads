//program for producer consumer 
package threads2;
class Queue{
	int data;
	public void put(int i) {
		data=i;
		System.out.println("DAta Added...the data value is:"+i);
	}
	public void get(int i) {
		System.out.println("DAta Retrieved...the data value is:"+data);
	}
}
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
	int i=0;
	while(true) {
		a.put(i);
		i++;
		
	}
	}
}
class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
	int i=0;
	while(true) {
		b.get(i);
		i++;
		
	}
	}
}


public class ProducerConsumer {

	public static void main(String[] args) {
	 Queue q=new Queue();
	 (new Producer(q)).start();
	 (new Consumer(q)).start();
	}

}
