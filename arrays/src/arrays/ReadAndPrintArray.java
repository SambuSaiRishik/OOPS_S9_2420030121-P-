package arrays;
import java.util.*;
public class ReadAndPrintArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 elements:");
	     for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	      }
	       System.out.println("You entered:");
	       for (int num : arr) {
	           System.out.println(num);
	        }
	    }
	}