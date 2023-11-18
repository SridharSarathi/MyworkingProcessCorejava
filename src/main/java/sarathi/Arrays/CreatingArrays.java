package sarathi.Arrays;


    
 import java.util.Arrays;
class CreatingArrays
{
public static void main(String[] args)
{CreatingArrays obj=new CreatingArrays();
//method 1
int numbers[]={10,20,30,40,50,60};
System.out.print("my array value is"+Arrays.toString(numbers));
System.out.println("\tSelected array value is"+numbers[3]);
for(int number:numbers)
{
System.out.println("my array value is:"+number);
}

for(int place=0;place<numbers.length;place++)
{
System.out.println(place+"place value is"+numbers[place]);
}
obj.method2();
}

public void method2()
{
String []fruit=new String[6];
fruit[0]="apple";
fruit[1]="orange";
fruit[2]="grapes";
fruit[3]="banana";
fruit[4]="mango";
fruit[5]="papaya";  
for(String fruit2:fruit)
{
System.out.println(fruit2);
}
System.out.println("my method 2 array is "+Arrays.toString(fruit)); 
for(int fruits=0;fruits<fruit.length;fruits++)
{
System.out.println("my method for loop array is "+fruit[fruits]);
}
}
}
