package sarathi.Variables;
public class variable
{
String name = "Sridhar";       //global variable is declare the inside the class outside main method  
static  float pivalue= 3.14f;   // static variable is decalare the inside the class outside the main method

public void global()
{
System.out.println(" method access static variable is --"+pivalue);            // static variable access the methods
System.out.println("global variable is --"+name);                               // global variable only access the methods
}

public void local()
{
short salary=15000;                                                                            //local variable declare the methods
System.out.println("acces the method local variable is --"+salary); //local variable only access the methods
                                                           //System.out.println(intial); instance variable did not access the  methods
}

public static void main(String args[])
{
variable v =new variable();
v.global(); v.local();
char intial='H';    //instance variable declare the main methods
System.out.println("instance variable  access main method --"+intial);    //instance variable access the main methods
System.out.println("static variable is main method -- "+pivalue); // static variable access the main methods

//System.out.println(salary);  --local variable cannot access the main method
// System.out.println(name); --Global variable did not  acces the main method

}
}