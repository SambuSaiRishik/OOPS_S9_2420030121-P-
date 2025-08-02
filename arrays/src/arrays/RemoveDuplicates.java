package arrays;
import java.util.*;
public class RemoveDuplicates {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 10, 30, 40, 20, 50};
	        Set<Integer> unique = new LinkedHashSet<>();

	        for (int num : arr) {
	            unique.add(num);
	        }

	        System.out.println("Unique elements:");
	        for (int num : unique) {
	            System.out.println(num);
	        }
	    }
	}
