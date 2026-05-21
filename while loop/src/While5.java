import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            System.out.println("Enter your action: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                balance += amt;
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                if (amt <= balance) {
                    balance -= amt;
                } else {
                    System.out.println("Insufficient balance");
                }
            } else if (choice == 3) {
                System.out.println("Balance: " + balance);
            }
        }
    }
}