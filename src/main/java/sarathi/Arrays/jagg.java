package sarathi.Arrays;

import java.util.Scanner;
import java.util.Arrays;
class jagg
{
public static void main(String[] args)
{
String bike[][]=new String[3][];
bike[0]=new String[3];
bike[1]=new String[2];
bike[2]=new String[4];
   for(int row=0;row<bike.length;row++)
        {
            for(int column=0;column<bike[row].length;column++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter bike  name"+row+" Row"+column+"column");
                bike[row][column]=scan.nextLine();
            }

        }
for(String bikes[]:bike)
{
for(String favour:bikes)
{
System.out.print(" "+favour);
}
System.out.println();
}
}
}