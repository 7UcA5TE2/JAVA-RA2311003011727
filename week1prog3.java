import java.util.Scanner;
class vendingmac {
    public static void main(String[] args) {
        
        System.out.println("press 1 for : juice \npress 2 for : soda");
        Scanner var= new Scanner(System.in);
        int choice=var.nextInt();
        if(choice==1){
            System.out.println("Dispensing juice");
        }
        else if(choice==2){
            System.out.println("Dispensing soda");
        }
        else{
            System.out.println("invalid choice");
        }
        var.close();
    }
}
