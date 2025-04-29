import java.util.Scanner;

class ATM{
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class TestATM {
    public static void main(String[] args) {

        ATM ATM = new ATM();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount:");
                    ATM.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount:");
                    ATM.withdraw(sc.nextDouble());
                    break;
                case 3:
                    ATM.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}