import java.util.*;
import java.lang.*;
class Test_String
{
public static void main(String args[])
{
Test_String TS=new Test_String();
TS.Byte_Array();
object_creation();
}
public void Byte_Array()
{
/*
byte[] b_arr={23,56,78,88,66,};
String s_arr=(String) b_arr;
System.out.println(Arrays.toString(s_arr));
 String cannot converted in byte*/
}
public static void object_creation()
{
//type 1
String name="Sarathi";
char [] ch={'A','B','C','D','E'};
//type 2
String arr=new String(ch);
System.out.println(arr);

}

}