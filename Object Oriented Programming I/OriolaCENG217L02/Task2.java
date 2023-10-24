import java.util.Scanner;
/**
 * Program that prompts the user to enter a two-dimensional arrays and displays the location of the largest element in the array
 *
 * @Clarence Oriola (n01573843)
 * @v1.0 10-11-2023
 */
public class Task2
{
    public static int[] locateLargest(double[][] a) {
    int[] location = {0, 0}; //intialized as the default location
    double max = a[0][0]; //default 0 ,0 variable to store the largest 
    
    for (int i = 0; i < a.length; i++) {
        for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            
            }
        }
        return location;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns of the array: ");
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        
        //Creating 2d array that ask the user for values
        double[][] array = new double[numRows][numCols];    
        System.out.println("Enter the array: ");
        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j < numCols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        
        //Calling the locateLargest method
        int[] location = locateLargest(array);
        
        //Display the location of the largest element
        System.out.println("The Location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }
}
