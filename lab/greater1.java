import java.util.*;
public class greater1
{
    public static void main(String[] args) 
{
int a,b,c;
System.out.println("enter the three numbers");
Scanner read=new Scanner(System.in);
a=read.nextInt();
b=read.nextInt();
c=read.nextInt();
        if(a>b&a>c)
        {
            System.out.println( a + "is larger");
        }
        if(b>a&b>c)
        {
            System.out.println(b + "is greater");
        }
        if(c>a&c>b)
        {
            System.out.println( c + " is greater");
        }
    }
    
}
