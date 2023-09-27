package sarathi;

public class Typecasting 
{
    public static void main(String[] args)
    {
        short convert1=33;
char convert2=(char)convert1;
int convert3=convert2;
float convert4=convert3;
long convert5=(long)convert4;
char convert6=(char)convert5;
System.out.println("short:"+convert1);
System.out.println("char:"+convert2);
System.out.println("int:"+convert3);
System.out.println("float:"+convert4+"\n Widening is over");
System.out.println("long:"+convert5);
System.out.println("char:"+convert6+"\n Narrowing is over");
    }    
}
