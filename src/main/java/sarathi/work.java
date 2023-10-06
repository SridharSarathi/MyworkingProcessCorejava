package sarathi;
public class work 
{
    public static void main(String[] args)
    {
        work name=new work();

        name.sample('K',"Srithar");
        name.motor();
        String tilestype=name.tiles();


        work name1=new work();
        float houselandsize=name1.squarefeet();

        System.out.println(" my tiles brand name is :"+tilestype);

        System.out.println(" my land size is :"+houselandsize);
    }

        // without returntype and with aruguments
    public void sample(char initial,String fullname)
    {
        System.out.println(" my initial is : "+initial);
        System.out.println("my full name : "+fullname);
    }

    // without return type and without arguments
    public void motor()
    {
        String motorbrand="hp";
        System.out.println(" my motor brand is"+motorbrand);
    }

    // with returntype and without arguments
    public String tiles()
    {
        System.out.println("return value in marbles ");
        return "Marbles";
    }

    public float squarefeet()
    {

    return 1968.4f;
    }

}


    
