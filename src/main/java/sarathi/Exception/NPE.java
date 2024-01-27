class NPE
{
public static void main(String args[])throws Exception
{
try{
String name=null;
System.out.println(name.length());
}catch(NullPointerException npe)
{

}
}
}