package sarathi.Arrays;

import java.util.Scanner;
import java.util.Arrays;
class InsertingArray

{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
short []year=new short[3];
for(int i=0;i<3;i++)
{
System.out.println("Enter a "+i+"year");
short Year=scan.nextShort();
System.out.println("Adding"+i+"year"+Year);
year[i]=scan.nextShort();
System.out.println("My Inserting arrays is"+Arrays.toString(year));


}
}



}

