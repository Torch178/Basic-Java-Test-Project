import java.util.Scanner;

public class CLuke_P2
{
   
   public static void main (String[] args)
   {
   
      //Initialize variables and Scanner Object
      String firstName = "";
      String lastName = "";
      String grade = "";
      String userEntry = "";
      String studentID = "";
      
      double homeworkScore = 0.0;
      double quizScore = 0.0;
      double midTermExam = 0.0;
      double finalExam = 0.0;
      double totalScore = 0.0;
      
      Scanner in = new Scanner(System.in);
      
      //Main Body of Program
      do
      {
      
         //Prompt user for student info
         System.out.println("Please enter the Student's ID: ");
         studentID = in.nextLine();
         
         System.out.println("Enter the student's first name: ");
         firstName = in.nextLine();
         
         System.out.println("Enter the student's last name: ");
         lastName = in.nextLine();
         
         //Flush the buffer
         in.nextLine();
         
         
         //Prompt user for grades / scores
         System.out.println("Please enter all grades / scores in percentage points (1% = 1.0)");
         
         System.out.println("Enter student's overall Assignments Score: ");
         homeworkScore = in.nextDouble();
         
         System.out.println("Enter the student's overall Quizzes Score: ");
         quizScore = in.nextDouble();
         
         System.out.println("Enter the student's Mid-Term Exam Score: ");
         midTermExam = in.nextDouble();
         
         System.out.println("Enter the student's Final Exam Score: ");
         finalExam = in.nextDouble();
         
         //Flush the buffer
         in.nextLine();
         
         
         //Calculate and add together weighted scores
         totalScore = (homeworkScore * 0.5) + (quizScore * 0.2) + (midTermExam * 0.1) + (finalExam * 0.2);
         
         
         //Assign a letter grade to student based on total score
         if (totalScore >= 90 && totalScore <= 100)
         {
            grade = "A";
         }
         
         else if (totalScore >= 80 && totalScore < 90)
         {
            grade = "B";
         }
         
         else if (totalScore >= 70 && totalScore < 80)
         {
            grade = "C";
         }   
         
         else if (totalScore >= 60 && totalScore < 70)
         {
            grade = "D";
         }
         
         else if (totalScore < 60)
         {
            grade = "E";
         }
         
         else
         {
            grade = "N/A";
         }
         
         
         //Output Final Results to User
         System.out.println(lastName + ", " + firstName);
         System.out.println("Student ID: " + studentID);
         System.out.println("Homework: " + homeworkScore);
         System.out.println("Quizzes: " + quizScore);
         System.out.println("Midterm: " + midTermExam);
         System.out.println("Final: " + finalExam);
         System.out.println("Total Score: " + totalScore + "\t\tGrade: " + grade);
         
         
         //Prompt user to see if they would like to continue or quit
         System.out.println("Would you like to enter scores for additional students? (Enter \"Q\" or \"Quit\" to exit.): ");
         userEntry = in.nextLine();
         
         
      }while(!userEntry.equalsIgnoreCase("Q") && !userEntry.equalsIgnoreCase("Quit"));
   
   
   }//end of driver class


}//end of program