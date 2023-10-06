package sarathi;

class Typecast
{
  public void typecasting(float weight )
  {
   char obj=(char)weight;
  System.out.println("My character value is":+obj);
  System.out.println("My number is floatvalue is":+weight);
  }
  public static void main(String[] args) 
  {
    Typecast obj2=new Typecast();
    obj2.typecasting(20.6f);
  }
}