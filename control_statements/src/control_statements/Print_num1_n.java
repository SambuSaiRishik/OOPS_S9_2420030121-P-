package control_statements;
import java.util.Scanner;
public class Print_num1_n {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            System.out.println(i);
	        }
	    }
	}


