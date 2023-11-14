import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int tot_sub = sc.nextInt(); // total number of subjects
        int tot_marks = 0; // total marks

        for (int i = 0; i < tot_sub; i++) {
            System.out.println("Enter the marks obtained in Subject:" + (i + 1)); // input of each marks
            int marks = sc.nextInt();
            tot_marks += marks; // calculating total marks
        }

        int avg_per = tot_marks / tot_sub; // calculating average percentage
        String grade = calculateGrade(avg_per); // calculate grade based on average percentage

        // Display
        System.out.println("Total marks obtained:" + tot_marks);
        System.out.println("Total Percentage obtained:" + avg_per+ "%");
        System.out.println("Grade: " + grade);
    }

    // Method to calculate grade based on average percentage
    private static String calculateGrade(int avg_per) {
        int grade = avg_per / 10;
        switch (grade) {
            case 10:
                return "O";
            case 9:
                return "A+";
            case 8:
                return "A";
            case 7:
                return "B+";
            case 6:
                return "B";
            case 5:
                return "C";
            default:
                return "F";
        }
    }
}
