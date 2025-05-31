package xyz;
class calculator{
	int add(int a,int b) {
		return a+b;
	}
	double cal(double a,double b) {
		return a*b;
	}
	int cal(int a,int b,int c) {
		return a*b*c;
	}
}

public class overloadingExample {

	public static void main(String[] args) {
		calculator c =new calculator();
		//c.add(20,30);
		System.out.println(c.add(20, 30));
		System.out.println(c.cal(20, 30));
		System.out.println(c.cal(20, 30,40));
	}
}
