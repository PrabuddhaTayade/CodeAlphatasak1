package grade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker 
{

    public static void main(String[] args)
    {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student grades (Type 'exit' to stop):");
        int studentNumber = 1; 
        
        while (true) 
        {
            System.out.print("Enter grade for Student " + studentNumber + ": ");
            String input = scanner.next();
            
            if (input.equalsIgnoreCase("exit")) 
            {
                break;
            }
            
            try 
            {
                int grade = Integer.parseInt(input);
                grades.add(grade);
                studentNumber++;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid integer grade or type 'exit' to stop.");
            }
        }
        
        if (grades.isEmpty())
        {
            System.out.println("No grades entered.");
            return;
        }
        
        int total = 0, highest = grades.get(0), lowest = grades.get(0);
        
        for (int grade : grades)
        {
            total += grade;
            if (grade > highest) 
            {
                highest = grade;
            }
            if (grade < lowest)
            {
                lowest = grade;
            }
        }
        
        double average = (double) total / grades.size();
        
        System.out.println("Number of students: " + grades.size());
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
