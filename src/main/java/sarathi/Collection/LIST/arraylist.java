import java.util.ArrayList;
import java.util.Iterator;
public class arraylist
{
public static void main(String args[])
{
//This is Genric Method
//Arraylist methods(add,remove,set,clear(all element can be deleted),size,)
ArrayList <String>AL=new ArrayList<String>();
AL.add("Mango");
AL.add("Graphs");
AL.add("Banana");
AL.add("Jackfruit");
AL.add("Papaya");
AL.remove("Papaya");
AL.set(0,"Apple");

System.out.println(AL.index(0));
//System.out.println(AL.size()+""+AL);
//iterator method

Iterator <String>it=AL.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}