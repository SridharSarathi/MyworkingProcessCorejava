/*interface sample
{
public void method(int a, int b);
}*/

public class add //implements sample
{

public void method(int a,int b)
{
System.out.println(a+b);
}
public static void main(String args[])
{
add obj=new add();
obj.method(10,89);
}
}