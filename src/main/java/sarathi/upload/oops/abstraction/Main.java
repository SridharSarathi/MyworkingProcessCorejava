abstract class red
{
abstract void draw();
abstract void paint();
}

class green extends red
{
 void paint()
{
System.out.println("Face");
}
void draw()
{
System.out.println("Body");
}
}

class Main extends green
{
public static void main(String args[])
{
green M=new green();
M.paint();
M.draw();
}

}