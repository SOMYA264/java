class rectangle
{
private int l,b;
rectangle(int x,int y)
{ l=x; b=y;}
int area()
{return(l*b);}
}
class room extends rectangle
{
int h;
room(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
}
 class class_room
{
public static void main(String args[])
{
room r=new room(10,20,15);
int a1=r.area();
int v1=r.volume();
System.out.println("Area of Room : "+a1);
System.out.println("Volume of Room : "+v1);
}
}