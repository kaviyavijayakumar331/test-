package devops;

public class Calculator {
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String args[]) {
		Calculator cl=new Calculator();
		int res=cl.add(5,10);
		System.out.println(res);
	}
}
