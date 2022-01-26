import java.util.*;
class currencyConverter{
    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER (USD to others))");
        System.out.println("Available Currency exchange Number: \n1.USD to INR \n2.USD to EURO \n3.USD to POUND \n4.USD to AUS \n5.USD to CAN");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency Exchange Number: ");
        int currency = sc.nextInt();
        System.out.println("Enter the amount tp be converted: ");
        float amount = sc.nextFloat();
        if (currency == 1)
        {
            System.out.println("Your amount is " + amount * 74.40+ " INR");
        }
        if (currency == 2)
        {
            System.out.println("your amount is " + amount * 0.88+" EUROS");
        }
        if (currency == 3)
        {
            System.out.println("Your amount is " +  amount * 0.74+" POUNDS");
        }
        if (currency == 4)
        {
            System.out.println("Your amount is " + amount * 1.39 + " AUSD");
        }
        if (currency == 5)
        {
            System.out.println("Your amount is " + amount * 1.25 + " CAND");
        }

        
    }
}
