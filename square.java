import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int sum=0,i;
		Scanner inp=new Scanner (System.in);
		int[] arr=new int[10];
		System.out.println("Enter 10 numbers in array");
		for(i=0;i<10;i++)
		{
			arr[i]=inp.nextInt();
			sum+=arr[i]*arr[i];
		}
		System.out.println("the sum is: "+sum);
	}
}