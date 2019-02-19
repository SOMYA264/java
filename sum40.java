class sum
{
public static void main(String args[])
{
	int i,sum=0;
	for(i=41;i<250;i++)
	{
		if(i%5==0)
		{
			sum+=i;
		}
	}
	System.out.println("Sum of all integers between 40 and 250 divisible by 5 is: "+sum);
}
}