import java.util.Scanner;
class Calculator
{	public static void main(String args[])
{
	int a,b,res=0,choice;
	Scanner inp=new Scanner(System.in);
	do
	{
	System.out.println("---------------------------------------");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("---------------------------------------");
	System.out.println("Enter choice: ");
	choice=inp.nextInt();
	System.out.println("Enter a: ");
	a=inp.nextInt();
	System.out.println("Enter b: ");
	b=inp.nextInt();
	switch(choice)
	{
		case 1: res=a+b;
				System.out.println("Addition of "+a+" and "+b+" is "+res);
				  break;
		case 2: res=a-b;
				System.out.println("Subtraction of "+a+" and "+b+" is "+res);
				break;
		case 3: res=a*b;
				System.out.println("Multiplication of "+a+" and "+b+" is "+res);
				break;
		case 4:	res=a/b;
				System.out.println("Division of "+a+" and "+b+" is "+res);
				break;
		default: System.out.println("you have entered a wrong choice");
	}}
	while(choice!=5);
	}
}
