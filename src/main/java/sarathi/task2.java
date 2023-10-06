package sarathi;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args)
     {
       task2 myobj=new task2(); 
        myobj.name(12,'R');
        myobj.product();
        int score=myobj.mark();
        System.out.println("my  science mark is :"+score);
       int returnvalue= myobj.salary(10,"Monday");
        System.out.println("My return value is:"+returnvalue);
        //System.out.println("my monthly salary is:"+month);
     
      }
    //without return type with arguments 
   public void name(int age, char initial)
{
  System.out.println("my age is:"+age );
  System.out.println("my initial is:"+initial);
}
//without return type without arguments
public void product()
{
String fruit= "Apple";
String veg="Tomoto";
System.out.println("my fruit name is:"+fruit);
System.out.println("my vegetable name is:"+veg);
}
//with return type without arguments
public int mark()
{
      return 66; 
    }
public short salary(int daycount,String day)
{
  System.out.println("your day count is "+daycount);
  System.out.println(" your dayis "+day);
  return 1;
}
  }
