import java.util.Scanner;

class LeapYearcheck {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = var.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } 
                else {
                    System.out.println(year + " is not a leap year.");
                }
            } 
            else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

        var.close();
    }
} 
