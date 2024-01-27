package sarathi.patterns;
import java.util.*;
public class lessthan
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        for(int row=1;row<=5;row++)
        {
            for(int col=1;col<=6-row;col++)
            {
                
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    for(int i=1;i<=5;i++)
    { for (int j = 0; j<i; j++) 
        {
        
            System.out.print("*  ");
    }
        System.out.println(" ");   
    }
}
}

