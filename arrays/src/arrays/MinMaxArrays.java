package arrays;

public class MinMaxArrays {
	    public static void main(String[] args) {
	        int[] arr = {15, 2, 78, 34, 7, 99, 0};
	        int min = arr[0];
	        int max = arr[0];
	        for (int num : arr) {
	            if (num < min) 
	            	min = num;
	            if (num > max) 
	            	max = num;
	        }
	        System.out.println("Smallest element: " + min);
	        System.out.println("Largest element: " + max);
	    }
	}