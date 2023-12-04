package gradecode;
import java.util.*;

public class CalculateStudentGrades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of subjects : ");
        int n = sc.nextInt();
        System.out.println("Enter Marks in each subject (less than 100): ");

        int arr[] = new int[n];
        boolean isValid = true;

        for (int i = 0; i < n; i++) {
            int mark;
            while (true) {
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    arr[i] = mark;
                    break; 
                } else {
                    System.out.println("Invalid marks.");
                    System.out.println("Enter the mark again for subject " + (i + 1) + ": ");
                }
            }
        }

        int sum = 0;
        char grade;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / n;

        if (avg >= 80) {
            grade = 'A';
        } else if (avg >= 60 && avg < 80) {
            grade = 'B';
        } else if (avg >= 40 && avg < 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Maximum Marks : "+n*100);
        System.out.println("Marks obtained = " + sum);
        System.out.println("Average Percentage = " + String.format("%.2f", avg) + "%");
        System.out.println("Your Grade is :" + grade);
    }
}
