import java.util.Scanner;
//WAP to display range of fibonacci number?
class fibonacci_number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int range=sc.nextInt();
int a=0;
int b=1;
int c=0;
System.out.println(a);
System.out.println(b);
for(int i=2;i<=range;i++)
{
c=a+b;
if(c<=range)
{
System.out.println(c);
a=b;
b=c;
}
}
}
}