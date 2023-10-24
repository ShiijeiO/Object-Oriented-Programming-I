import java.util.Scanner;
/**
 * An Administration system that holds the student's full name,
 * student id, and five-course grades.
 *
 * @Clarence Oriola
 * @v1.0
 */
public class Task3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a Scanner object for user input
        
        String fullName, studentID; //Variables that will be used to store Name and Student ID number
        int grade; //Will be used for my for loop condition for the five-course grade
        int credits = 0; //Used later for input 
        
        //User input section
        System.out.print("Enter a Student Name: ");
        fullName = scanner.nextLine(); // Reads and stores full name
        
        System.out.print("Enter Student ID: ");
        studentID = scanner.nextLine(); // Reads and stores the student ID
        
        // Loop to input grades for five courses
        for(int i = 0; i < 5; i++) {
            
            System.out.print("Enter Student grade " + (i + 1) + ": ");
            grade = scanner.nextInt(); // Reads and stores the grade
            
            if (grade >= 50)  {
                credits++; // Increments the credits if the grade is above 50
            }
            
        }
        // Generates a loginname using the first four letters of fullname and the first three numbers of student id
        String loginName = fullName.substring(0, 4) + studentID.substring(0, 3);
        
        //Output
        System.out.println("Student Login: " + loginName); // Displays the generated login name
        System.out.println("Student ID: " + studentID); // Displays the student ID
        System.out.println("Credits: " + credits); // Displays the total credits
        
    }
}
