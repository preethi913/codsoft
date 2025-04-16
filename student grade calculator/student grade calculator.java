import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Define the number of subjects
        int numSubjects = 5;  // You can change this value for different numbers of subjects
        int totalMarks = 0;

        // Array to store marks for each subject
        int[] marks = new int[numSubjects];

        // Take marks as input for each subject
        System.out.println("Enter marks for " + numSubjects + " subjects (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];  // Add the marks to the total
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine the grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}

Output:

Enter marks for 5 subjects (out of 100):
Subject 1: 85
Subject 2: 90
Subject 3: 78
Subject 4: 88
Subject 5: 92

Results:
Total Marks: 433 out of 500
Average Percentage: 86.6%
Grade: A