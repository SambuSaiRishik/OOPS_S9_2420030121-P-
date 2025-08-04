package string;
import java.util.*;
public class MultipleStringMethods {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine(); 
          System.out.println("Original=" + str);
	       System.out.println("Length=" + str.length());
	       System.out.println("Uppercase=" + str.toUpperCase()); 
	       System.out.println("Lowercase" + str.toLowerCase());
       System.out.println("First character=" + str.charAt(0));
        System.out.println("Substring (0 to 4)=" + str.substring(0, 3));
       System.out.println("Equals 'hello'=" + str.equals("hello"));
        System.out.println("Contains 'a'=" + str.contains("a"));
		    }
		}