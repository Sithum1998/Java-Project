package cse.school.codejam;

/**
 * Interface defining banking operations for account management and transactions.
 * Provides methods for creating accounts and handling financial operations.
 */
public interface BankService {

    /**
     * Creates a new bank account with the specified account number and account holder name.
     *
     * @param accountNumber     the unique identifier for the account
     * @param accountHolderName the name of the account holder
     * @throws IllegalArgumentException if an account with the given account number already exists
     */
    void createAccount(String accountNumber, String accountHolderName);

    /**
     * Deposits the specified amount into the account identified by the account number.
     *
     * @param accountNumber the account to deposit into
     * @param amount        the amount to deposit (must be positive)
     * @throws IllegalArgumentException if the amount is not positive or the account doesn't exist
     */
    void deposit(String accountNumber, double amount);

    /**
     * Withdraws the specified amount from the account identified by the account number.
     *
     * @param accountNumber the account to withdraw from
     * @param amount        the amount to withdraw (must be positive)
     * @throws IllegalArgumentException if the amount is not positive, the account doesn't exist,
     *                                  or there are insufficient funds
     */
    void withdraw(String accountNumber, double amount);

    /**
     * Transfers the specified amount from one account to another.
     *
     * @param fromAccountNumber the source account
     * @param toAccountNumber   the destination account
     * @param amount            the amount to transfer (must be positive)
     * @throws IllegalArgumentException if the amount is not positive, either account doesn't exist,
     *                                  or there are insufficient funds in the source account
     */
    void transfer(String fromAccountNumber, String toAccountNumber, double amount);

    /**
     * Retrieves the account details for the specified account number.
     *
     * @param accountNumber the account to look up
     * @return a string representation of the account details
     * @throws IllegalArgumentException if the account doesn't exist
     */
    String getAccountDetails(String accountNumber);

    /**
     * Retrieves the current balance for the specified account number.
     *
     * @param accountNumber the account to check
     * @return the current account balance
     * @throws IllegalArgumentException if the account doesn't exist
     */
    double getAccountBalance(String accountNumber);
}
