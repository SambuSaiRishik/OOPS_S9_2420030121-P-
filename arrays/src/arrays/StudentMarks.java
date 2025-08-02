package arrays;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        int total_marks = 0;

        System.out.println("Enter each subject's marks:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            total_marks += arr[i];
        }

        System.out.println("Subject Marks:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + arr[i]);
        }

        System.out.println("Total Marks: " + total_marks);
        double average = (double) total_marks / size;
        System.out.println("Average Marks: " + average);
    }
}
