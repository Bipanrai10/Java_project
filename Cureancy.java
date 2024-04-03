import java.util.Scanner;

public class Cureancy {
    public static void main(String[] args) {
        int direction;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("\nChoose the conversion direction");
            System.out.println("1.Nepali rupees to other currency\n2.Other currency to nepali Rupees\n3.exit");
        System.out.println("Enter your choice:-");
       
        if(scanner.hasNextInt()){
        direction=scanner.nextInt();
        switch (direction) {
            case 1:
                nepalitoother(scanner);
                break;

              case 2:
              othertonepali(scanner);
              break;

                case 3:
                System.out.println("Close the program");
                scanner.close();
                return;
                
        
            default:
            System.out.println("invalid choice");
            break;
        }
    }
     }
}
        
    public static void nepalitoother(Scanner scanner){
        double money;
        int Rupee;
        System.out.println("Enter the Amount(NPR):-");
        Scanner read=new Scanner(System.in);
        Rupee=read.nextInt();
        System.out.println("------------main menu---------");
        System.out.println("1.Dollar\n2.Dirham\n3.Yen\n4.Yuan\n5.Saudi riyal \n6.Back to home \n7.exit");
        System.out.println("Enter your choice:-");
        int option=scanner.nextInt();
        switch (option) {
            case 1:
            money=Rupee*0.0075;//0.0075 is exchange rate in dollar(United state)
            System.out.printf("In Dollar=%.2f",money);
                break;

                case 2:
                money=Rupee*0.028;//0.028 is exchange rate in Dirham(United Arab emirates)
                System.out.printf("In Dirham=%.2f",money);
                break;

                case 3:
                money=Rupee*1.14;//1.14 is exchange rate in yen(Japenese)
                System.out.printf("IN Yen=%.2f",money);
                break;

                case 4:
                money=Rupee*0.054;//0.054 is exchange rate in yuan(Chinese)
                System.out.printf("In Yuan=%.2f",money);
                break;
                
                case 5:
                money=Rupee*0.028;//0.028 is exchange rate in riyal(Saudi)
                System.out.printf("In Saudi riyal=%.2f",money);
                break;

                case 6:
                System.out.println("Back to home");
                return;

                case 7:
                System.out.println("Close program");
                scanner.close();
                System.exit(0);

            default:
            System.out.println("Error in Input user");
                break;
        }
    }
    

    public static void othertonepali(Scanner scanner){
        double money;
        int amount;
        System.out.println("Enter your amount:-");
        Scanner read=new Scanner(System.in);
        amount=read.nextInt();
        System.out.println("------------main menu---------");
        System.out.println(" choose your currency to convert it into nepali Rupees(NPR)");
        System.out.println("1.Dollar\n2.Dirham\n3.Yen\n4.Yuan\n5.Saudi riyal\n6.Back to home\n7.exit");
        System.out.println("Enter your choice:-");
        int option=scanner.nextInt();
        switch (option) {
            case 1:
                money=amount*133.57371;//133.18 is exchange rate in nepali currency(NPR)
                System.out.printf("IN NRP=%.2f",money);
                break;

                case 2:
                money=amount*36.370764;//36.370764 is the exchange rate in nepali currency(NPR)
                System.out.printf("IN NRP=%.2f",money);
                break;

                case 3:
                money=amount*0.88031628;//0.88031628 is the exchange rate in nepali currency(NPR)
                System.out.printf("IN NRP=%.2f",money);
                break;

                case 4:
                money=amount*18.460632;//18.460632 is the exchange rate in nepali currency(NPR)
                System.out.printf("IN NRP=%.2f",money);
                break;

                case 5:
                money=amount*35.62077;//35.62077 is the exchange rate in nepali currency(NPR)
                System.out.printf("IN NRP=%.2f",money);
                break;

                case 6:
                System.out.println("Back to home");
                return;

                case 7:
                System.out.println("Close program");
                scanner.close();
                System.exit(0);

            default:
            System.out.println("Error user input");
                break;
        }
    } 
}
