import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        char card = 'Y';

        while (card == 'Y' || card == 'y') {

            System.out.println("===== ATM =====");
            System.out.println("1. Withdraw");
            System.out.println("Enter your choice:");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    atm();
                    break;

                default:
                    System.out.println("Please check and try again..");
                    break;
            }

            System.out.println("Do you want to try again? (Y/N)");
            card = sc.next().charAt(0);
        }

        System.out.println("Thank you for using ATM!");
    }

    public static void atm() {

        int balance = 10000;
        int withdraw;

        System.out.print("Enter money to be withdrawn: ");
        withdraw = sc.nextInt();

        if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("Please collect your money..");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient Balance..");
        }
    }
}
