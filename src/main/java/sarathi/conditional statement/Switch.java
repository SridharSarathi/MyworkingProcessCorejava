package sarathi;

import java.util.Scanner;

public class Switch 
{
    public static void main(String[] args)
    {
     Switch obj=new Switch();
     Scanner obj1=new Scanner(System.in);
     System.out.println("Enter your mark");
     int mark=obj1.nextInt();
     obj.student(mark);
    }
    public void student(int mark)
    {
            switch(mark)
    {
    case 1:
        System.out.println("You rank is 1" );
                break;
    case 2:
        System.out.println("You rank is 2" );
                break;
    case 3:
        System.out.println("You rank is 3" );
                break;
    case 4:
        System.out.println("You rank is 4" );
                break;
    case 5:
        System.out.println("You rank is 5" );
                break;
    default:
        System.out.println("you have failed");
        break;
 }
    }
}
