package cohort15;

import java.util.Scanner;

public class ScannerScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of the product you are buying?");
        String productName = scan.next();
//        productName += scan.nextLine();

        System.out.println("What is the price of it?");
        int price = scan.nextInt();

        System.out.println("How many did you get?");
        int qty = scan.nextInt();

        System.out.println("How many miles will our delivery be?");
        int miles = scan.nextInt();

    }
}
