interface multiple1
{
public void fun1(String name1);
}

 interface  multiple2
{
public void fun2(String name2);
}

class multiplechild implements  multiple1, multiple2
{
 
public void fun1(String name1)
{ 

System.out.println("Hello"+"  "+name1); }
public void fun2(String name2)
{

  System.out.println("This World for you"+name2);  } 
}


class test
{
public static void main(String args[]){
multiplechild t=new multiplechild();
t.fun1("sridhar");
t.fun2("sarathi");
}
}