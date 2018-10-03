import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private static int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name name of bank account
     * @param accountCategory the category of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountNumber = accountNumber + 1;
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return ab
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param input input
     */
    public void setAccountBalance(final double input) {
        accountBalance = input;
    }

    /**
     *
     * @param input input
     */
    public void setOwnerName(final String input) {
        ownerName = input;
    }

    /**
     *
     * @return count
     */
    public static int getAccountNumber() {
        return accountNumber;
    }

}
