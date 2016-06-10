import java.util.*;

public class a
{
public static int sum(int n)
{
Scanner obj=new Scanner(System.in);
int arr[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++)
{
arr[i]=obj.nextInt();
}
int s=0;
for(int i=0;i<n;i++)
{
s+=arr[i];
}
return s;
}
public static void main(String args[])
{
int n;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the nuber of elements:");
n=obj.nextInt();
int sum1=sum(n);
System.out.println("Sum of elements is:"+sum1);
}
}