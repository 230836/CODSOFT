import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks obtained in each subject
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.println("subject 4:");
        int subject4 = scanner.nextInt();
        System.out.println("subject 5:");
        int subject5 = scanner.nextInt();

        // Calculate Total Marks
        int totalMarks = subject1 + subject2 + subject3+ subject4 + subject5;

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / 590;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
