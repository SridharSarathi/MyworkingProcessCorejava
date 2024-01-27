package sarathi.Operators;
class Arithemetric
{
public static void main(String args[])
{
Arithemetric op =new Arithemetric();
op.addition();op.sub(34.9f,45);op.divimulti();
}
public void addition()
{
int maths =123;
int external=10;
System.out.println(maths+external);
}

public void sub(float percentage, double point)
{
System.out.println(percentage-point);
}
public void divimulti()
{
short t=3;
int y=2;
int ans=y*t;
float er = 468.97f;
double value=67;
System.out.println(ans+"  "+er/value+" "+(t%y+6));
}
}