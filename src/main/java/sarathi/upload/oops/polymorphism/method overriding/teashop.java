class  hotel
{

public void water(int a, String b)
{
System.out.println("water bottle rate in hotel:"+b+a);
}

}


class teashop extends hotel
{
public void water(int a, String b)
{
System.out.println("Teashop rate in bottle:"+b+a);
}
public static void main(String args[])
{
hotel H=new hotel();
teashop T=new teashop();
H.water(20,"bisleri");
T.water(15,"bisleri");
}
}