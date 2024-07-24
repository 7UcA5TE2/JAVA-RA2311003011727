import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        System.out.println("Enter 1 for addition or 2 for subtraction");
        Scanner var = new Scanner(System.in);
        int choice=var.nextInt();
        int number1,number2;
        if(choice==1){
             System.out.println("Enter two numbers");
              number1=var.nextInt();
              number2=var.nextInt();
             System.out.println("sum is equal to : "+ (number1+number2));
        }
        else if(choice==2){
            System.out.println("Enter two numbers");
              number1=var.nextInt();
              number2=var.nextInt();
             System.out.println("diffrence is equal to : "+ (number1-number2));
        }
        else{
             System.out.println("invalid choice");
        }
        var.close();
    }
}
