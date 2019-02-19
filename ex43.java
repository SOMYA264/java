class worker
{
String name;
int empno;
worker(int no,String n)
{ empno=no; name=n; }
void show()
{
System.out.println("Employee number : "+empno);
System.out.println("Employee name : "+name);
}
}
class dailyworker extends worker
{
int rate;
dailyworker(int no,String n,int r)
{
super(no,n);
rate=r;
}
void compay(int h)
{
show();
System.out.println("Salary : "+rate*h);
}
}
class salariedworker extends worker
{
int rate;
salariedworker(int no,String n,int r)
{
super(no,n);
rate=r;
}
int hour=40;
void compay()
{
show();
System.out.println("Salary : "+rate*hour);
}
}

 class salary
{
public static void main(String args[])
{
dailyworker d=new dailyworker(20,"rahul",45);
salariedworker s=new salariedworker(66,"Unmi",100);
d.compay(50);
s.compay();
}
}