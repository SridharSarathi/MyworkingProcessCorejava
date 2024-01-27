package sarathi.patterns;
import java.util.Scanner;
class xpattern
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("enter the numer");
int num=scan.nextInt();
//int num=10;
for(int row=0;row<=num;row++)
{ 
for(int col=0;col<=num;col++)
{
if(col==row||(col+row)==num)
{
System.out.print(row);
}
else
{
System.out.print(" ");
}
}
System.out.println("");
}
}
}