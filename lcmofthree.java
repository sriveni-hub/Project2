import java.util.*;
class lcmofthree
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,largest,lcm=0;
System.out.println("Enter the value of a and b");
a=sc.nextInt();
b=sc.nextInt();
largest=((a>b)&&(a>c))?(a:(b>c))?b:c);
for(i=1;i<=largest;i++)
{
if(largest%a==0&&largest%b==0&&largest%c==0)
{
lcm=largest;
break;
}
largest++;
}
System.out.println("lcm of three numbers:"+lcm);
}
}
