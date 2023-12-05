class Bun
{
public void total(int a, char B)
{
System.out.println("your bill amount is:"+B+"-"+a);
}
public void total(int a, float b)
{
System.out.println("your bill amount is:"+(a+b));
}
public void total(String u, double y)
{
System.out.println("your bill amount is:"+u+y);
}
}


class bakery
{
public static void main(String args[])
{
Bun B=new Bun();
B.total(10,'T');
B.total(100,0.50f);B.total("Coffee",7.90);
}
}