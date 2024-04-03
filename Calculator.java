import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       double total;
        System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTPLICATION\n4.DIVISION\n5.MODULUS\n6.EXIT");
        System.out.println("Enter your choice:-");
        int option=scanner.nextInt();
        double Num1,Num2;
        System.out.println("Enter the number:-");
        Num1=scanner.nextDouble();
        System.out.println("Enter the number:-");
        Num2=scanner.nextDouble();
        switch(option){
            case 1:
            total=Num1+Num2;
            System.out.printf("%.2f + %.2f =%.2f",Num1,Num2,total);
            break;

            case 2:
            total=Num1-Num2;
            System.out.printf("%.2f - %.2f =%.2f",Num1,Num2,total);
            break;

            case 3:
            total=Num1*Num2;
            System.out.printf("%.2f * %.2f =%.2f",Num1,Num2,total);
            break;

            case 4:
            if(Num2==0)
            {
                System.out.println("Error! Can not be divided by zero");
                return;
            }
            
            total=Num1/Num2;
            System.out.printf("%.2f / %.2f =%.2f",Num1,Num2,total);
            break;

            case 5:
            total=Num1%Num2;
            System.out.printf("%.2f %% %.2f =%.2f",Num1,Num2,total);
            break;

            case 6:
            scanner.close();
            System.exit(0);

        }
    }
}
