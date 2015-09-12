package lab03_a;
import java.util.*;

/*
 * Jonas Boudreau
 * CSM10J Lab 3, Part A
 */

public class Lab03_A {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        int faxPages;
        double faxCost = 3.20; 
        System.out.print("How many pages to fax? ");
        faxPages = console.nextInt();
        if (faxPages > 10)
            faxCost = (3.20 + ((faxPages - 10) * .10));
        System.out.printf("That will cost $%.2f%n", faxCost);
    }
    
}
