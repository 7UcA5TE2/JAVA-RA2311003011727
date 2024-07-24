import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Please enter your exam marks out of 100: ");
        Scanner var = new Scanner(System.in);
        int marks = var.nextInt();

        String grade;
        switch (marks / 10) {
            case 10:
                grade = "A (Excellent)";
                break;
            case 9:
                grade = "A (Excellent)";
                break;
            case 8:
                grade = "B (Very Good)";
                break;
            case 7:
                grade = "C (Good)";
                break;
            case 6:
                grade = "D (Satisfactory)";
                break;
            default:
                if (marks >= 0 && marks < 60) {
                    grade = "F (Fail)";
                } 
                else {
                    grade = "Invalid  marks";
                }
                break;
        }

        System.out.println("Your grade is: " + grade);
        var.close();
    }
}
