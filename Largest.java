import java.util.Scanner;

class Largest
{
public static void main(String args[])
{

	Scanner inp = new Scanner(System.in);
	System.out.println("Enter 3 numbers: ");
	int a = inp.nextInt();
	int b = inp.nextInt();
	int c = inp.nextInt();
	if (a>b && a>c)
	{
		System.out.println(a + " is greatest");
	}
	else if(b>c)
	{	
		System.out.println(b + " is greatest");
	}
	else
	{
		System.out.println(c + " is greatest");
	}
	
}
}
