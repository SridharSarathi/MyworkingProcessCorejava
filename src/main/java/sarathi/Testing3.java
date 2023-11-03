package sarathi;
import java.util.Scanner;

public class Testing3 
{
    public static void main(String[] args) 
    {
       Testing3 obj=new Testing3();
        obj.course();
    }
    public void course()

    {   int mbbs=0;
        int pharmacy=0;
        int nursing=0;
        int Maths=0;
        int Arts=0;
        int cs=0;
        int not=0;
        int none=0;

    for(int member=1;member<=5;member++)
     {
       Scanner scan=new Scanner(System.in);System.out.println("Enter your group");String data=scan.nextLine();
       if(data.equals("biology"))
       {
        System.out.println("You are selected the biology");
        System.out.println("Enter your Mark");
        int mark=scan.nextInt();
                         if(mark>=95)
                         {
                         System.out.println("you are selected in MBBS");
                             mbbs++;
                         }
                         else if(mark>=90)
                         {
                             System.out.println("Your selected in Nurshing ");
                             nursing++;
                                 }
                                 else if(mark>=85)
                                  {
                                  System.out.println("you are selected in pharmacy");
                                  pharmacy++;
                                  }
                                 else{
                                  System.out.println("you are not eligible choose another course");
                                    not++;
                                   }
      }

       else if(data.equals("Arts"))
           {
            System.out.println("You are selected in MBA");
            Arts++;
          }
        else if(data.equals("Maths"))
        {
            System.out.println("You are selected in Engineering");
            Maths++;
        }  
        else if(data.equals("computer Science"))
        {
            System.out.println("you are selected in Programmer");
            cs++;
        }
       else
       {
            System.out.println("you are not eligible");
            none++;
        } 
       
     }
      System.out.println("No of students select in MBBS:"+mbbs);      System.out.println("No of students select in Pharmacy :"+pharmacy);
        System.out.println("No of students select in Programmer :"+cs);        System.out.println("No of students select in Engineering :"+Maths);
        System.out.println("No of students select in MBA:"+Arts);      System.out.println("No of students select in Nurshing :"+nursing);
     System.out.println("No of Student select but not eligible:"+not);System.out.println("No of Student not eligible:"+none);
    }
        
    
}
