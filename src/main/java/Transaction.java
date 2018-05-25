import java.time.LocalDateTime;

/**
 * Created by folawiyo on 5/20/18.
 */
public class Transaction {
    private double amount;
    private LocalDateTime time;
    private TransactionType type;

    public Transaction(double amount, LocalDateTime time, TransactionType type) {
        this.amount = amount;
        this.time = time;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public  String toString(){
        return this.amount+" "+this.time+" "+this.type;
    }


}
