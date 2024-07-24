import java.util.Scanner;
class Agecheck {
    public static void main(String[] args) {
        
        System.out.println("please enter your age ");
        Scanner var= new Scanner(System.in);
        int age=var.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else if(age>0 && age<18){
            System.out.println("you are not eligible to vote");
        }
        else{
            System.out.println("error in age");
        }
     var.close();
    }
}
