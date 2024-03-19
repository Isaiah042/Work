package cohort15;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) { Scanner scan = new Scanner(System.in);
        String name;

        do {
            System.out.println("What is your name?");
            name = scan.nextLine();

            if (name.equalsIgnoreCase("Alice")) {
                System.out.println("Welcome Alice");
                break;
            } else if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome Bob");
                break;
            } else {
                System.out.println("Try Again");
            }
        } while (true);
        scan.close();
    }
}
