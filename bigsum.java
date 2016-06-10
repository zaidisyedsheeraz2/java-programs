import java.util.*;
public class bigsum
{
static void sum(int n,int arr[])
{
long s=0;
for(int i=0;i<n;i++)
{
s=s+arr[i];
}
System.out.println (s);
}
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
int n=scr.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scr.nextInt();
}
bigsum obj=new bigsum();
obj.sum(n,arr);
}
}