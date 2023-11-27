package sarathi.looping;public class Dowhile{
public static void main(String[] args){
int i=1;
do
{
    if(i==10)
         {
           i++;
            break;
            }

System.out.println("2");
System.out.println("loop will not stop");//do{
                                          //    }
i++;                                        // while(condition);

}
while(i==0);

}
}