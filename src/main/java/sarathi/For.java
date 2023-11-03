package sarathi;
import java.util.Scanner;


public class For 
{
    public static void main(String[] args) 
    {
    For obj=new For();
    System.out.println("Rank veryfing");
     obj.loop();

    }

       public void loop()
    {
    Scanner scan=new Scanner(System.in);
    int fail=0;
    int pass=0;
    for(int number=1;number<=5;number++)
          {
            System.out.println("Enter your  mark");
             int mark=scan.nextInt();
               if (mark>=35)
               {
                System.out.println("you are pass");
                pass++;
                if(100==mark)
               {
             System.out.println("you are centum");
               }
               else if((mark<=60)&&(mark>=35))
                {
             System.out.println("you are mid level make hard work");
               }
               else
               {
                System.out.println("Next time target is +");
               }
              }
              else 
              {
              System.out.println("you are fail");
               fail++;
              }
            }

          System.out.println("pass student count"+pass);
                    
                System.out.println("fail student count"+fail);

    }
    }

