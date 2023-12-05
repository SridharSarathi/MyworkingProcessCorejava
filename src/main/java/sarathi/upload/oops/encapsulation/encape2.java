class encap1
{
private int number;
private String name;
private float time;
 
public void Setnumber(int number)
{
this.number=number;
}
        public void Setname(String name)
         {
         this.name=name;
        }
public void Settime(float time)
{
this.time=time;
}

       public  float gettime()
       {     
             return time;
          }
public String getname()
{
return name;
}
        public  int getnumber()
       {
        return number;
           }
}              
//=========================================
class encap2 
{
public static void main(String args[])
{
encap1 E=new encap1();
E.Setname("David");
E.Settime(11.00f); 
E.Setnumber(675757);
System.out.println("coming time is"+E.gettime()+"name is"+E.getname()+"boy number is"+E.getnumber());
}
}