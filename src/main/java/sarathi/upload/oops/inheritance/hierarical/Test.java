import java.util.Scanner;
class TGACR1 extends university
{
Scanner TG=new Scanner(System.in);
public void course1()
{
System.out.println("Arts course\n"+"enter your mark");
int mark=TG.nextInt();
if(mark>=90)
{    System.out.println("you admission approval\n"+"enter your cut off"); 
                 int mark1=TG.nextInt();
            if(mark1>=70 & mark<=90)
            {
            System.out.print("you eligible for B.Com\t"+"political science\t economic");
            }
            else
            {
            System.out.println("you eligible for history\t"+"public administration \n");
            }
}
else
{
System.out.println("you not eliglible");
}
}
}
//----------------------------------------------------
//import java.util.Scanner;

class  TGACR2 extends university
{
Scanner TG=new Scanner(System.in);
public void course2()
{
System.out.println("Science course\n"+"enter your mark");
int mark=TG.nextInt();
if(mark>=90)
{    System.out.println("you admission approval\n"+"enter your cut off"); 
                 int mark1=TG.nextInt();
            if(mark1>=70 & mark<=90)
            {
            System.out.println("you eligible for chemistry\n"+"computer science science\n maths");
            }
            else
            {
            System.out.println("you eligible for physic\n"+"nutriens\n");
            }
}
else
{
System.out.println("you not eliglible");
}
}
}
//------------------------------------------------------
class Test 
{

public static void main(String[] args)
{
TGACR1 T=new TGACR1();
T.sample();
T.course1();
System.out.println("ARTS COURSE FINISH") ;
TGACR2 TT=new TGACR2();
TT.sample();
TT.course2();
System.out.println("SCIENCE COURSE FINISH") ;
}
}