package sarathi.Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Addingarrays
{
public static void main(String[] args)
{
System.out.println("welcome");
Scanner scan=new Scanner(System.in);
short []year=new short[3];
for(int i=0;i<3;i++)
{
System.out.println("Enter a "+i+" position of year");
year[i]=scan.nextShort();
}
System.out.println("My Inserting arrays is"+Arrays.toString(year));
}
}
