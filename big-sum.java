import java.util.*;
public class big-sum
{
static long sum(int n,int arr[])
{
long s=0;
for(int i=0;i<n;i++)
{
s=s+arr[i];
}
return s;
}
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
int n=scr.nextInt();
int arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scr.nextInt();
}
int res=sum(n,arr);
System.out.println(res);
}
}