import javax.swing.JOptionPane;
public class box
{
public static void main(String args[])
{
String name=JOptionPane.showInputDialog("enter your name");
JOptionPane.showMessageDialog(null,"hello"+name);
String age=JOptionPane.showInputDialog("enter your age");
JOptionPane.showMessageDialog(null,"your age is"+age);
System.out.println(name+""+age);
}
}