package cse.school.codejam;

public class Main {

    public static void main(String[] args) {
        TransactionLogger transactionLogger = new TransactionLogger();
        InputUtil inputUtil = new InputUtil();
        AccountRepository accountRepository = new AccountRepository();
        BankService bankService = new BankServiceImpl(transactionLogger, accountRepository);
        Teller teller = new Teller(inputUtil, bankService, transactionLogger);
 }
}
       public void start() {
        while (true) {
            System.out.println("====== CodeJam Bank CLI ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Account Details");
            System.out.println("6. View Account History");
            System.out.println("7. Exit");

            int option = teller.getUserPreference(); // Assuming this gets input from user

            try {
                switch (option) {
                    case 1:
                        teller.createAccount();  // Assuming this is implemented in Teller
                        break;
                    case 2:
                        teller.depositFunds();  // Assuming this is implemented in Teller
                        break;
                    case 3:
                        teller.withdrawFunds();  // Assuming this is implemented in Teller
                        break;
                    case 4:
                        teller.transferFunds();  // Assuming this is implemented in Teller
                        break;
                    case 5:
                        teller.checkAccountDetails();  // Assuming this is implemented in Teller
                        break;
                    case 6:
                        teller.checkTransactionHistory();  // Assuming this is implemented in Teller
                        break;
                    case 7:
                        System.out.println("Goodbye!");
                        return;  // Exits the loop
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());  // Catch specific exceptions if possible
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
    }
}

