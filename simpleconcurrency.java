package xyz;



class mytask extends Thread{
	private String taskname;
	
	public mytask(String taskname) {
		// TODO Auto-generated constructor stub
		this.taskname=getName();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskname+"steps"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(taskname+"was interrupted");
			}
		}
	}
}
public class simpleconcurrency {

	public static void main(String[] args) {
		mytask t1=new mytask("Cooking");
		mytask t2=new mytask("Washing");
		t1.start();
		t2.start();
	}
}
