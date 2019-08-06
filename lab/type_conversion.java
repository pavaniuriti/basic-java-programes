//1.lab type conversion
class convertion
{
public static void main(String args[])
{
byte a=10;
int b;
b=a+200;                    //byte converted into integer
System.out.println(b);
float c;
c=a+21;                         //byte conveted to flat
System.out.println(c);

long d;
d=a+20000;
System.out.println(d);   //byte to long conversion
c=b+200;
System.out.println(c);   //integer to float conversion
d=c+300;                        //float to long conversion  is incompatible
System.out.println(d);
}
}