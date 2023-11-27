package sarathi.looping.practise;
import java.util.Arrays;
class Arraytask2
{
public static void main(String[] args)
{
int arr[][]={{15,25,35,45},{11,12,13,14},{55,65,75,85},{80,90,70,60}};
System.out.println("My value of 2 Dimensonal Array ");
for(int Arr[]:arr)
{
for(int ARR:Arr)
{
System.out.print(" "+ARR);
} 
System.out.println();
}
//     0  1  2  3
//0-  15 25 35 45
//1-  11 12 13 14
//2-  55 65 75 85
//3-  80 90 70 60
//65 55 80 90 70 60 85,75,13,14,45,35,25,15,11,12 
int index=0;
int change[]=new int[arr.length*4]; 
int row=2,column=1;
for(;column>=0;column--)
{
change[index]=arr[row][column];
index++;
}
column++;row++;
for( ;column<=3;column++)
{
change[index]=arr[row][column];
index++;
}
column--;row--;
for(;column>=2;column--)
{
change[index]=arr[row][column];
index++;
}
column++;row--;
for( ;column<=3;column++)
{
change[index]=arr[row][column];
index++;
}
column--;row--;
for(;column>=0;column--)
{
change[index]=arr[row][column];
index++;
}
column++;row++;
for(;column<=1;column++)
{
change[index]=arr[row][column];
index++;
}

System.out.println(Arrays.toString(change));

//Array Reverse Order 
System.out.println("Reversing Array ");
for(int i=change.length-1;i>=0;i--)
{
System.out.print(change[i]+" ");
}
System.out.println(" ");

//Add or even 
System.out.println("Odd number");
for(int i=0;i<change.length;i++)
{
if(change[i]%2!=0)
{
System.out.print(change[i]+" ");
}
}
System.out.println(" ");

System.out.println("Even Number");
for(int i1=0;i1<change.length;i1++)
{
if(change[i1]%2==0)
{
System.out.print(change[i1]+" ");
}
}
}
}