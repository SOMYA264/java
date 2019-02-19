import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Student
{
	public static void main(String args[])
	{	
		int i;
		ArrayList<String> grades=new ArrayList<String>();
		int[] marks=new int[10];
		Scanner inp=new Scanner (System.in);
		System.out.println("enter student marks: ");
		for(i=0;i<10;i++)
		{
			marks[i]=inp.nextInt();
		}
		Arrays.sort(marks);
		for(i=0;i<10;i++)
		{
			if(marks[i]>=40 && marks[i]<=50)
			{
				grades.add("PASS");
			}
			else if(marks[i]>=51 && marks[i]<=75)
			{
				grades.add("MERIT");
			}
			else if(marks[i]>75)
			{
				grades.add("DISTINCTION");
			}
			
		}
		System.out.println("\n\n\nMARKS\t\t\tGRADES");
		for(i=0;i<10;i++)
		{
			System.out.println(marks[i]+"\t\t\t"+grades.get(i));
			
		}
	}}