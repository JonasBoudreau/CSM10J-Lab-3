import java.util.*;

/**
 * Jonas Boudreau
 * CSM10J Lab03_B_While
 */
public class Lab03_B_While {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int num1, num2, counter, sum = 0;
        System.out.print("Input the first number: ");
        num1 = console.nextInt();
        System.out.print("Input the second number: ");
        num2 = console.nextInt();
        
        System.out.println("\nAll odd numbers between " 
                + num1 + " and " + num2 + " inclusive.");
        counter = num1;
        while (counter <= num2){
            if (counter % 2 != 0){
                System.out.println(counter);
            }
            else
                sum += counter;
            counter++;
        }
        System.out.println("\nSum of all even numbers between " 
                + num1 + " and " + num2 + " inclusive");
        System.out.println(sum);
    }
    
}
