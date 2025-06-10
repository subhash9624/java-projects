package xyz;
class Car implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=3;i++) 
		{
			System.out.println("car is moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}
	}
}
class Bike implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=3;i++) 
		{
			System.out.println("Bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}
	}
}
public class Thread_runnable {

	public static void main(String[] args) {
		Thread t1=new Thread(new Car());
		Thread t2=new Thread(new Bike());
		t1.start();
		t2.start();
	}

}
