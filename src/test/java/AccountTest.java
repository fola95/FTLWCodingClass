import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by folawiyo on 5/20/18.
 */
public class AccountTest {
    private Account account;

    @Before
    public void setUp(){
        account = new Account();
    }

    @Test
    public void checkIfICanCreditAnAccount(){
        account.credit(12);
        Assert.assertEquals(12, account.getCurrentBalance(),0.01);
    }

    @Test
    public void checkIfICanDebitAnAccount(){
        account.debit(12);
        Assert.assertEquals(-12, account.getCurrentBalance(),0.01);
    }

    @Test
    public void checkIfICanGetAllTransactionsDoneOnAccount(){
        account.credit(900);
        account.credit(34);
        account.debit(20);
        Assert.assertEquals(account.getAllTransactions().size(),3);
    }

    @Test
    public void checkIfICanSeeAllTransactionsForOnlyThisMonth(){
        account.credit(900);
        account.credit(34);
        System.out.println(account.getThisMonthTransactions());
    }

}