package sarathi.Arrays;

import java.util.Scanner;
import java.util.Arrays;
class Three
{
    public static void main(String[] args) 
    {   
        int [][][] mark=new int [3][4][2];


int count=1;
for(int row=0;row<mark.length;row++)
{
for(int column=0;column<mark[row].length;column++)
{ewraq
for(int values=0;column<2;values++)
{

mark[row][column][values]=column+=10;
}
}
}

for(int row=0;row<mark.length;row++)
{
for(int column=0;column<mark[row].length;column++)
{
System.out.print("{");
for(int values=0;values<mark[row][column].length;values++)
{
System.out.print(mark[row][column][values]+" ");
}
System.out.print("}");
 }
System.out.println();
}


}
}