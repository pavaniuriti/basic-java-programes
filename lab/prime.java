//prime numbers in the particular range
public class prime
{
    public static void main(String[] args)
 {
        int n=1;
        for(n=1;n<500;n++)
        {
       int i=1;
       int count=0;
        for(i=1;i<n;i=i+1)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println(n);
        }
                   
        }
    }
}
        