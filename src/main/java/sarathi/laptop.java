package sarathi;
import java.util.Scanner;

public class laptop 
 {
   
   public static void main(String[] args)
    {
     laptop sri=new laptop();
     Scanner scan=new Scanner(System.in);
     System.out.println("------welcome to our laptop showroom------\n");
     System.out.println("enter your amount");
     int amount=scan.nextInt();
     sri.entry(amount);
    }

    public void entry(int value)
    {
      Scanner scan1=new Scanner(System.in);
            if(value>=100000)
            {
                 System.out.println("You will buy appple");  
            }
                 if(value>=50000)
                 {
                  System.out.println("You will buy lenovo");
                 }                            
                 else if(value>=40000)
                 {
                  System.out.println("you will buy acer");
                  }
                 else if(value>=30000)
                 {
                   System.out.println("you will buy hp");
                 } 
                 else if(value>=20000)
                 {
                   System.out.println("you will buy HCL");
                 } 
            else{
               System.out.println("currently not available");
            }
    }
 }
