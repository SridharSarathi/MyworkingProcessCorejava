package sarathi.operators;
public class Operators
{

public static void main(String[] args)
{
    Operators charge=new Operators();
    
        charge.travel();
        //relational operators
        int my_10_mark=428;
        int MY_12_mark=423;
        System.out.println("my 10 and 12 marks are same:"+(my_10_mark == MY_12_mark));
        System.out.println("my 10 12 marks are not equal:"+(my_10_mark != MY_12_mark));
        System.out.println("my 10 marks is higher than equal 12:"+(my_10_mark >= MY_12_mark));
        System.out.println("my 10 marks is lowethan:"+(my_10_mark <= MY_12_mark));
        System.out.println("my  10 marks is greatherthan 12:"+(my_10_mark > MY_12_mark));
        System.out.println("my 10 marks is lowethan 12:"+(my_10_mark < MY_12_mark));
        System.out.println("relational operator was finish\t");
       
        charge.logical("sridhar" ,"epm",3,5);

}

public void travel()
{
    //Arithemetic operators using
int fees=11;
float bus=fees-4.00f;
int empty=11;
int em=empty+100;
int rm=em*=23;
int fm=rm/4;
int gm=fm%2;
System.out.println("my travel charge is"+bus);
System.out.println("my empty value is:"+em);
System.out.println("my em value is:"+rm);
System.out.println("my fm value is:"+em);
System.out.println("my gm value is:"+fm);
System.out.println("Arithemetic operator finished\n");
}
//logical operator
public void logical(String name,String area,int height, int width)
{
System.out.println((area==name)&&(height<width));
System.out.println("logical was finish");
}

}


    
