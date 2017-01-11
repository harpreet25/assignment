import java.util.*;

public class parallelArrays {

    public static void main(String[] args) {
       String[] names;
       int[] exam1Grades;
       int[] exam2Grades;
       int n, sum1, sum2;
       double avg1,avg2;

       Scanner kb = new Scanner(System.in);

       // Get the number of students from the user
       System.out.print("Enter # of students:");
       n = kb.nextInt();

       // Allocate the arrays
       names = new String[n];
       exam1Grades = new int[n];
       exam2Grades = new int[n];

       // Input the names and grades
       for (int i=0; i<=names.length-1; i++) {
          System.out.print("Enter name for student #" + (i+1) + ":");
          names[i] = kb.next();
          System.out.print("Enter exam #1 grade:");
          exam1Grades[i] = kb.nextInt();
          System.out.print("Enter exam #2 grade:");
          exam2Grades[i] = kb.nextInt();
       }

       // Add up all the grades (could have been done in the above loop)
       sum1 = 0;
       sum2 = 0;
       for (int i=0; i<=names.length-1; i++) {
          sum1 = sum1 + exam1Grades[i];
          sum2 = sum2 + exam2Grades[i];
       }

       // Calculate and output the averages
       avg1 = sum1/n;
       System.out.println();
       System.out.println("Exam #1 average: " + avg1);

       avg2 = sum2/n;
       System.out.println("Exam #2 average: " + avg2);
       System.out.println();

       // Compare each grade to the average
       for (int i=0; i<=names.length-1; i++) {
       if (exam1Grades[i] > avg1)
           System.out.println("Student " + names[i] + " is above average on exam 1");
           else if (exam1Grades[i] < avg1)
           System.out.println("Student " + names[i] + " is below average on exam 1");
           else
           System.out.println("Student " + names[i] + " is average on exam 1");

       if (exam2Grades[i] > avg2)
           System.out.println("Student " + names[i] + " is above average on exam 2");
           else if (exam2Grades[i] < avg2)
           System.out.println("Student " + names[i] + " is below average on exam 2");
           else
           System.out.println("Student " + names[i] + " is average on exam 2");

       }
    }
}