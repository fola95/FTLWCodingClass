import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by folawiyo on 5/20/18.
 */
public class Account {

    private double balance;
    private List<Transaction> transactions;

    public Account(double startBalance) {
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        addStealthTransactionForExample();
    }
    public Account(){
        this.transactions = new ArrayList<>();
        addStealthTransactionForExample();

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

    public List<Transaction> getAllTransactions(){
        // @Todo implement a way to get all transactions
        return null;
    }

    public List<Transaction> getThisMonthTransactions() {
        // @Todo: Implement a way to get the transactions for the current month
        return this.transactions;
    }

    private void addStealthTransactionForExample(){
        Transaction transaction = new Transaction(0, LocalDateTime.of(2015, Month.APRIL,1,1,23), TransactionType.DEBIT);
        this.transactions.add(transaction);
    }


}
