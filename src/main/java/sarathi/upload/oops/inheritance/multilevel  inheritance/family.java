class multilevel1
{
public static void main(String[] args)
{
}
public float business()
{
float profit1=10.9f,profit2=34.9f;
System.out.println(profit1-profit2);
return 0;
}
public void work()
{
float salary=12.34f;int annualsalary=700;
System.out.println(salary+" "+annualsalary);
}

}
//--------------------------------------------------------------------------------
class multilevel2 extends multilevel1
{
public static void main(String[] args){}
public void food()
{
String snacks="lays",snacks2="bingo";
System.out.println("snacks is :"+snacks+" and "+snacks2);
}
public void drink()
{
String d1="mazza",d2="7up";
System.out.println("my drink is:"+d2+" and "+d1);
}
}
//---------------------------------------------------------------------------------
class multilevel3 extends multilevel2
{
public void dolls()
{
int packet=122;
int dd= 1;
System.out.println("dolls method working\n"+packet/dd);
}
}
//---------------------------------------------------------------------------------
class family extends multilevel3
{
public static void main(String[] args)
{
family f=new family();
f.dolls();
f.drink();
f.food();
f.work();
f.business();
}
}