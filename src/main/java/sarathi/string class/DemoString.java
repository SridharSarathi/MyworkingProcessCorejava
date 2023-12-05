import java.util.Arrays;
class DemoString
 {
public static void main(String[] args)
{ 
DemoString obj=new DemoString();
char name[]={'A','B','C','D','E','F'};
System.out.println("Array is"+Arrays.toString(name));

String Myname=new String(name);// chars chage into letter
System.out.println(Myname);
obj.test();obj.test2();obj.test3();
}

public void test()
{
String S1="Encapsulation";
String S2="Inheritance";

// String contain method -  that is add the String into another String , Syntax variable name.(concat-method)=(variale name)
S1.concat(S2);
System.out.println(S1);
System.out.println(S1=S1.concat(S2));

// using charAt menthod
System.out.println(S1.charAt(3));

//equals and equalsIgnoreCase(value by albapetic letter)
String S3="Ginger",S4="GingER";
System.out.println(S1.equals(S2));
System.out.println(S3.equals(S2));
System.out.println(S1.equalsIgnoreCase(S2));System.out.println(S3.equalsIgnoreCase(S4));
}
public void test2()
{
//compareto and comparetoignorecase(based on ascii number)
String V="hello",W="Hello";
System.out.println(V.compareTo(W));
System.out.println(V.compareToIgnoreCase(W));
//int M=(int)V;
//System.out.println(M);


//uppercase and lowercase
System.out.println(V.toUpperCase());
System.out.println(W.toLowerCase());

//replace String method
String words="my name is john cena ";
words=words.replace('n','a');
System.out.println(words);
}
public void test3()
{
//contains --contains method is find the word are letter inside the string and this output true or false
String letter=" i am a software devloper and i trained many skills";
System.out.println(letter.contains("i"));


//Substring method(get a value in between a number and start from given number)
String a="i am amazing",b="i ambrilliant";
System.out.println(a.substring(3));
System.out.println(b.substring(2,6));
}
}
