package sarathi;
import java.util.Scanner;
public class Myscanner
{
    
public static void main(String[] args)
{
Myscanner sri=new Myscanner();
Scanner sarathi=new Scanner(System.in);
//bscilfd
System.out.println("Do you want enter your Ration card details(yes/no):\n");
String opinion=sarathi.nextLine();
//chages
System.out.println("Enter your card Status(active(true)/deactive(false)):\n");
boolean Status=sarathi.nextBoolean();

System.out.println("Enter your card Stage-low(0)/high(1):\n");
byte Stage=sarathi.nextByte();

System.out.println("Enter your Shop No:\n");
short Shop=sarathi.nextShort();

System.out.println("Enter your Card No:\n");
long card=sarathi.nextLong();

System.out.println("Enter a Holder Name:\n");
String Name=sarathi.next();

System.out.println("Enter Your Holder2 Name:\n");
String Name2=sarathi.next();

System.out.println("Place of the shop pincode:\n");
int pincode=sarathi.nextInt();

System.out.println("Address:\n");
String address=sarathi.nextLine();

System.out.println("Enter a sugar price(With Paisa):\n");
float price=sarathi.nextFloat();

System.out.println("Enter a This Month Bill:\n");
double bill=sarathi.nextDouble();

System.out.println(":-----------Your Ration Card Details----------:\t");
System.out.println("My opinion:\t "+opinion+"\nCard Status:\t "+Status+"\nCard Stage:\t "+Stage+"\nShop No:\t "+Shop+"\nCard No:\t "+card+"\nHolder Name:\t "+Name+"\nHolder2 Name:\t "+Name2+"\nPincode:\t" +pincode+"\nSugar Price:\t "+price+"\nThis Month Bill:\t "+bill);


}
}