import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by folawiyo on 5/20/18.
 */
public class Account {

    private double balance;
    private List<Transaction> transactions;

    public Account(double startBalance) {
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        addStealthPreviousMonthTransactionForExample();
        addStealthPreviousYearTransactionForExample();
    }

    public Account() {
        this.transactions = new ArrayList<>();
        addStealthPreviousYearTransactionForExample();
        addStealthPreviousMonthTransactionForExample();

    }

    public void credit(double toCredit) {
        // @Todo implement credit
        Transaction transaction = new Transaction(toCredit, LocalDateTime.now(), TransactionType.CREDIT);
        this.transactions.add(transaction);
    }

    public void debit(double toDebit) {
        // @Todo implement debit
        Transaction transaction = new Transaction(toDebit, LocalDateTime.now(), TransactionType.DEBIT);
        this.transactions.add(transaction);
    }

    public double getCurrentBalance() {
        return this.balance;
    }

    public List<Transaction> getAllTransactions() {
        // @Todo implement a way to get all transactions
        return this.transactions;
    }

    public List<Transaction> getAllTransactionsForThisMonth() {
        // @Todo: Implement a way to get the transactions for the current month
        return null;
    }

    public List<Transaction> getAllTransactionForTheYear() {
        // @Todo: Implement a way to get the transactions for the current month
        return null;
    }


   /**
     * This is a function for adding a previous month transaction. It is purely for testing purposes.
     */
    private void addStealthPreviousMonthTransactionForExample() {
        Transaction transaction = new Transaction(0, LocalDateTime.of(2018, Month.APRIL, 1, 1, 23), TransactionType.DEBIT);
        this.transactions.add(transaction);
    }

    /**
     * This is a function for adding a previous month transaction. It is purely for testing purposes.
     */
    private void addStealthPreviousYearTransactionForExample() {
        Transaction transaction = new Transaction(0, LocalDateTime.of(2018, Month.APRIL, 1, 1, 23), TransactionType.DEBIT);
        this.transactions.add(transaction);
    }



}
