 interface practise
{
//interface inclusde the unimplements methods only
public void method1();
public void method2();
}

//normal class
class testing implements practise
{
public static void main(String[] args)
{
testing T=new testing();
T.method1();
T.method2();
}
public void method1()
{
int a=3400,b=565;
int c=a+b;
System.out.println(c);
}
public void method2()
{
System.out.println("interface class is working");
}
}
