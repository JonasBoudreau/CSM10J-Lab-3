package lab03_b_for;
import java.util.*;

/**
 * Jonas Boudreau
 * CSM10J Lab03_B_For
 */
public class Lab03_B_For {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int num1, num2, counter, sum = 0;
        System.out.print("Input the first number: ");
        num1 = console.nextInt();
        System.out.print("Input the second number: ");
        num2 = console.nextInt();
        
        System.out.println("\nAll odd numbers between " 
                + num1 + " and " + num2 + " inclusive.");
        for (counter = num1; counter <= num2; counter++)
        {
            if (counter % 2 != 0){
                System.out.println(counter);
            }
            else {
                sum += counter;
            }
        }

        System.out.println("\nSum of all even numbers between " 
                + num1 + " and " + num2 + " inclusive");
        System.out.println(sum);
    }
    
}
