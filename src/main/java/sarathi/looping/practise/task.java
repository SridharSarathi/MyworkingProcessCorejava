package sarathi.looping.practise;
import java.util.Scanner;

public class task
{
    public static void main(String[] args)
    {
        task my=new task();   

        my.runtime();

        my.typecast(89, 89.9);
    
    }
    public void typecast(int mark,double percentage )
    {
        char inttochar=(char)mark;

        short doubtoshort=(short)percentage;
        System.out.println("my mark is:"+mark);
        System.out.println("my percentage is:"+percentage);
        System.out.println(" my charcter value is :"+inttochar);
        System.out.println(" my short value is :"+doubtoshort);
    }

    public void runtime()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name \n");
        String name=scan.nextLine();
        System.out.println("your name is :"+name);

    }
}
