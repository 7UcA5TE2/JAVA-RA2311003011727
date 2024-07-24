import java.util.Scanner;


class NumberCheck {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        float num = var.nextFloat();

        if (num > 0) {
            System.out.println("The number is positive");
        } 
        else if (num < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
        var.close();
    }
}
