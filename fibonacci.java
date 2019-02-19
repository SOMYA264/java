class Fib
{
	public static void main(String args[])
	{
		int a1,a2,a3=0;
		a1=0;
		a2=1;
		System.out.println("First 10 terms of fibonacci series are:\n");
		System.out.println(a1+"\n"+a2);
		for(int i=2;i<10;i++)
		{
			a3=a1+a2;
			a1=a2;
			a2=a3;
		
		System.out.println("\n"+a3);
		}
		
		
	}
}