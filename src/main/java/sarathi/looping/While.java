package sarathi.looping;
import java.util.Scanner;



public class While
 {
    public static void main(String[] args)
     {
        int amount=100;
       // balance=cash-=amount;
      while(amount>0) 
      {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your amount");int cash=scan.nextInt();
        if (cash<=amount) 
        {
         System.out.println("your amount is:"+cash);
         amount-=cash; 
          System.out.println("only balance amount is:"+amount);
       }
       else
       {
        System.out.println("your balance is low");
        }
           
      }
       
    }
}
