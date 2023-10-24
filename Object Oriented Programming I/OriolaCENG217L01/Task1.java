import java.util.Scanner;
/**
 * Write a description of class Task1 here.
 *
 * @Clarence Oriola
 * @version (0.1)
 */
public class Task1
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); //Create a Scanner object
        //a.
        System.out.println("Enter input for a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter input for b: ");
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        //b.
        System.out.println("Enter input for m: ");
        double m = scanner.nextDouble();
        System.out.println("Enter input for n: ");
        double n = scanner.nextDouble();
        double p = Math.sqrt(Math.abs(m - n));
        
        //c.
        System.out.println("Enter input for r: ");
        double r = scanner.nextDouble();
        double sum = a * (Math.pow(r,n) - 1 / (r-1));
        
        //result
        System.out.println("The result of expression a is: " +c);
        System.out.println("The result of expression p is: " +p);
        System.out.println("The result of expression sum is: " +sum);
    }
    /**
    public static void main(String[] args){
        double a = 4;
        double b = 3;
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        double m = 7;
        double n = 8;
        double p = Math.sqrt(Math.abs(m - n)); //m and n weren't declared
        
        double r = 2;
        double sum = a * (Math.pow(r,n) - 1 / (r-1)); //missing a bracket and r wasn't declared
        
        System.out.println("The result of expression a is: " +c);
        
        System.out.println("The result of expression b is: " +p);
        
        System.out.println("The result of expression sum is: " +sum);
        
    }
    */
   
   
}
