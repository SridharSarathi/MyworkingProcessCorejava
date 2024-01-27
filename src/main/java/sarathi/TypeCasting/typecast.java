class typecast
{
public static void main(String args[])
{
//byte---boolean---short---char--int--float--double--long
// widening
byte value=1;
float ans=value;
System.out.println(ans);
char v1='1';
short v2=(short)v1;
System.out.println(v2);
// Narrowing
long ph=8119999l;
float pn=(float)ph;
System.out.println(pn);
}

}