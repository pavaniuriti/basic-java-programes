//palindrome number
public class palindrome
{
public static void main(String[] args)
{
int n=122,s=0,a=0;
a=n;
while(a!=0)
{
s=s*10;
s=s+a%10;
a=a/10;
}
if(n==s)
{
System.out.println("palindrome");
}
else
{
System.out.println("nnot a palindrome");
}
}
}