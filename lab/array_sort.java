//array reading from keyboard and sorting the array elements
import java.util.*;
class array1
{
public static void main(String args[])
{
int i=0;
int n=0;
int a[]=new int[5];
Scanner read=new Scanner(System.in);
n=a.length;
System.out.println("enter the array elements");
for(i=0;i<n;i++)
{
a[i]=read.nextInt();
}
System.out.println("the elements in the array are");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("the sorted array is");
int temp=0,j=0,k=0;
for(k=n;k>0;k--)
{
for(j=0;j<n;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[j]);
}
}
}