import java.util.*;
class Swapoftwo
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int a,b,temp;
System.out.println("Enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before swaping:a="+a+"b="+b);
temp=a;
a=b;
b=temp;
System.out.println("After swaping:a="+a+"b="+b);
}
}






