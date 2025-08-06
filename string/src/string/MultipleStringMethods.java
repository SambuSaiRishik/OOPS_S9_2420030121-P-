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
        System.out.println("Substring index at begin and end=" + str.substring(0, 8));
       System.out.println("Equals 'rishik'=" + str.equals("rishik"));
        System.out.println("Contains 'a'=" + str.contains("a"));
        System.out.println("Compare 'Java' "+str.compareTo("Java"));
        System.out.println("character 3 "+str.charAt(3));
        System.out.println("Equals ignore case'rishik' "+str.equalsIgnoreCase("rishik"));
        System.out.println("Compare ignore 'Java' "+str.compareToIgnoreCase("Java"));
        System.out.println("Starts with 'Hi' "+str.startsWith("Hi"));
        System.out.println("Ends with 'tata' "+str.endsWith("tata"));
        System.out.println("Index of "+str.indexOf("rishik"));
        System.out.println("Last index "+str.lastIndexOf("8"));
        System.out.println("Trim "+str.trim());
        System.out.println("replace "+str.replace("rishik","java"));
        System.out.println("Replacing all "+str.replaceAll("rishik", "sai"));
        System.out.println("Replacing first "+str.replaceFirst("sai", "Hii"));
        System.out.println("To character array "+str.toCharArray());
        System.out.println("empty "+str.isEmpty());
        System.out.println("Value of"+str.valueOf(str));
		    }
		}