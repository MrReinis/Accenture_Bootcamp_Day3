import org.junit.Test;
import static org.junit.Assert.*;


public class BankAccountTest {

@Test // Tests BankAccount constructor
    public void  testConsturctor() {
        new BankAccount();
}


@Test // Tests deposit amount
    public void testDeposit () {
    (new BankAccount()).deposit(200d);
}

@Test
    public void  testWithdraw () {
    (new BankAccount()).withdraw(4500d);
}


@Test
    public void testOverdraftWithdraw () {
    (new BankAccount()).withdraw(5500d);

}


@Test
    public void testTransferFrom1Account (){

BankAccount bankaccount1 = new BankAccount();
bankaccount1.transferFrom(new BankAccount(), 200d);

}
@Test
    public void testTransferedFrom2Account() {

        BankAccount bankaccount2 = new BankAccount();
        bankaccount2.transferFrom(new BankAccount(), 5500d);

    }

}


