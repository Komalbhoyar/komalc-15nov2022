import java.util.Scanner;
//WAP to diplay equilateral trinagle with star
class equilateral
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for (int j=0;j<n-i-1;j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}


