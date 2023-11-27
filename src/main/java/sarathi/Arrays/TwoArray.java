package sarathi.Arrays;

import java.util.Arrays;
class TwoArrays

{
public static void  main(String[] args)
{
//datatype [][]=variablename=new datatype [rowsize][columnsize];
int [][] Rollno=new int [3][3];
Rollno[0][0]=01;
Rollno[0][1]=02;
Rollno[0][2]=03;

Rollno[1][0]=04;
Rollno[1][1]=05;
Rollno[1][2]=06;

Rollno[2][0]=07;
Rollno[2][1]=8;
Rollno[2][2]=9;
//for each
//for(datatype newarrayname:arrayname)
//{}
for(int roll[]:Rollno)
{
for(int Tworoll:roll)
{
System.out.print(" "+Tworoll);
}
System.out.println(); 
}


int [][]Price={{100,200,300},{111,121,131},{456,567,678}};

for(int row=0;row<=2;row++)
{
for(int column=0;column<3;column++)
{
System.out.print(Price[row][column]+"  ");
}
System.out.println(" ");
}


}
}
