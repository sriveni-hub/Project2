import java.util.*;
class Surfacearea
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float len,bre,h,vc,ts;
System.out.println("Enter the length,breadth and height");
len=sc.nextFloat();
bre=sc.nextFloat();
h=sc.nextFloat();
vc=len*bre*h;
ts=2*(len*bre+bre*h+h*len);
System.out.println("Volume of cuboid is:"+vc);
System.out.println("Total surface of cuboid is:"+ts);
}
}