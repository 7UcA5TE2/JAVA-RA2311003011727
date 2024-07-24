import java.util.Scanner;


class Tempcheck {
    public static void main(String[] args) {
        
        System.out.println("please enter the current temperature in celsius");
        Scanner var= new Scanner(System.in);
        int temp=var.nextInt();
        if(temp>30){
            System.out.println("it's hot");
        }
        else if(temp>=20 && temp=<30){
            System.out.println("it's warm");
        }
        else if(temp>=10 && temp=<20){
            System.out.println("it's cool");
        }
        else{
            System.out.println("it's cold");
        }
       var.close(); 
    }
}
