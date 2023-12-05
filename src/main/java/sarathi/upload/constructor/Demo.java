package sarathi.constructor;


    
class Demo
{
String letter;
int a;
String  name;
//int arr[]=new int[4];
float water;

public Demo(String name1,float water1)
{
this.name=name1;
water=water1;

System.out.println(name+" "+water);
}
public Demo()
{
System.out.println(name);
System.out.println(water);
}

public static void main(String[] args)
{
new Demo("Sridhar",78.5f);
new Demo();

}
}
