public class BankAccount {

    /*3) create a class "BankAccount" with property "balance" (should be decimal number)
            * create empty default constructor for it
    * create a constructor with parameter for setting balance.
            * create a method "deposit" with one parameter "amount" (decimal number)
    which allows user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
            (decimal number) which allows user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
 */

    private double balance;


    public BankAccount() {

    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 5000) {
            System.out.println("Check transaction amount, max transaction amount is 5000 " + "Your deposit " +amount);
            return;

        }
        balance += amount;
        System.out.println("Transaction complete " + amount);


    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough funds, please check the sum " + amount);
            return;
        }
        balance -= amount;
        System.out.println(" Withdraw complete " + ", Remaining funds " + amount);
    }

    public void printBalance(double remainingBalance) {
        remainingBalance = balance;
        System.out.println("Your balance " + remainingBalance);


    }

    public void transferFrom (BankAccount transferFrom, double amount){

        if (amount > balance){
            System.out.println("Not enough funds to transfer the amount" + "Available funds " +balance + " You tried to transfer " + amount);
            return;
        }
        this.balance += amount;
        transferFrom.balance -= amount;
    }

    public double getBalance(){

        return balance;
    }

}