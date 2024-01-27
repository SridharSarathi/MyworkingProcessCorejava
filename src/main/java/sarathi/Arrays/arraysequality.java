import java.util.Arrays;
class  arraysequality
{
public static void main(String args[])
{
           int array1[]={1,2,3,4,5};
           int array2[]={1,2,3,4,5};
             boolean isEqual=Arrays.equals(array1,array2);
   if(isEqual)
  {
       System.out.println("array are equal");
   }
   else
   {
      System.out.println("arrays are not equal");
    }
System.out.println(Arrays.toString((array1))+Arrays.toString(array2));

}
}