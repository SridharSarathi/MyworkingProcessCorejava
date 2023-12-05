public class hybrid extends sample3 implements sample1,sample2
{
public void M1(int amount)
{
System.out.println(amount);
}
public void M2(String product)
{
System.out.println(product);
}
public static void main(String args[])
{
hybrid H=new hybrid();
H.M3('A');
H.M1(100);
H.M2("Food");
}
}

interface sample1
{
public void M1(int amount);
}

interface sample2
{
public void M2(String product);
}

class sample3
{
public void M3(char C)
{
System.out.println(C);
}

}
