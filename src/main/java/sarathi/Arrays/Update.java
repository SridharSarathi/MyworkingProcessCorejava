package sarathi.Arrays;

import java.util.Scanner;
import java.util.Arrays;
class update
{
public static void main(String[] args)
{
float liter[]={1.5f,1.9f,2.5f,3.5f,8.8f};
Scanner scan=new Scanner(System.in);
System.out.println("which inedex you change");
float Liter=scan.nextFloat();
System.out.println("My array is "+Arrays.toString(liter));
System.out.println("change liter of Array"+liter[(int)Liter]);
System.out.println("Enter the new liter");
float newliter=scan.nextFloat();
liter[(int)Liter]=newliter;
System.out.println("updated liter array"+Arrays.toString(liter));
for(float newliters:liter){
System.out.print(newliters);

}
}
}

