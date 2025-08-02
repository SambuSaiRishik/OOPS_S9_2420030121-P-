package control_statements;
import java.util.Scanner;
public class Until_zero {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a number (0 to stop): ");
	            num = sc.nextInt();
	            if (num != 0) {
	                System.out.println("You entered: " + num);
	            }
	        } while (num != 0);

	        System.out.println("Program ended.");
	    }
	}
