import java.util.Scanner;
//WAP to display range of perfect number?
class range_perfect_no
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
for (int num=1;num<=n;num++)
{
int sum=1;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
sum=sum+i;
}
if(sum==num)
{
System.out.println("is a perfect number"+num);
}
}
}
}
