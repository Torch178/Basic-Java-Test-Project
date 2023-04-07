import java.util.Scanner;

public class CLuke_FE
{

   public static void main (String[] args)
   {
   
      //Initialize variables and objects
      String firstName = "";
      String lastName = "";
      int age = 0;
      int years = 0;
      int months = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      
      
      Scanner in = new Scanner(System.in);
      
      //Ask user for data and collect input
      System.out.println("Please enter your first name: ");
      firstName = in.nextLine();
      
      System.out.println("Please enter your last name: ");
      lastName = in.nextLine();
      
      //Flush the buffer when changing data types
      in.nextLine();
      
      System.out.println("Please enter your age (in years): ");
      age = in.nextInt();
   
      //Make calculations for different aspects of age
      months = age * 12;
      
      days = age * 365;
      
      hours = days * 24;
      
      minutes = hours * 60;
      
      seconds = minutes * 60;
      
      //Output final results for user
      System.out.println("( "+lastName+" ), ( "+firstName+" )");
      System.out.println("( "+age+" ) years old.");
      System.out.println("( "+months+" ) months old.");
      System.out.println("( "+days+" ) days old.");
      System.out.println("( "+hours+" ) hours old.");
      System.out.println("( "+minutes+" ) minutes old.");
      System.out.println("( "+seconds+" ) seconds old.");
      
   }


}