//arthamatic operations in array
import java.util.*;
class array_artha
{
public static void main(String args[])
{
int array[]=new int[5];
int array1[]=new int[5];
Scanner read=new Scanner(System.in);
int n,m,i=0,j=0;
n=array.length;
m=array1.length;
System.out.println("enter 1st array elements");
for(i=0;i<n;i++)
{
array[i]=read.nextInt();
}
System.out.println("enter 2nd array elements");
for(j=0;j<m;j++)
{
array1[j]=read.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(array[i]+array1[i]);
System.out.println(array[i]-array1[i]);
System.out.println(array[i]*array1[i]);
System.out.println(array[i]/array1[i]);
}
}
}
