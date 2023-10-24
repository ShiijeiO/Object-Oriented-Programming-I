import java.util.Scanner;

/**
 * Defines Two methods to calculate the average on an integer array and a double array
 * Also includes ask the user to enter 10 double values and displays the average
 *
 * @Clarence Oriola (N01573843)
 * @v2.0 (10/11/2023) +comments
 */
public class Task1
{
    public static int average(int[] array)
    {
        int sum = 0;
        
        //Calculates the sum of all elements in the array
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Calculate and return the average
        return sum / array.length;
    }
    
    public static double average(double[] array)
    {
        double sum = 0.0;
        
        // Calculate the sum of all elements in the array
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Calculate and return the average
        return sum / array.length;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 10 double values in: ");
        double[] values = new double[10];
        
        // Prompt the user to input 10 double values
        for(int i = 0; i < 10; i++)
        {
            values[i] = scanner.nextDouble();
        }
        
        // Calculate the average of the input values and display it
        double avg = average(values);
        System.out.println("The Average Value is: " +avg);
        
        scanner.close();
        
    }
}
