

class Learning {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(700.2);
        BankAccount otherAccount = new BankAccount(660.8);
        System.out.println("My primary account has : " + myAccount.getBalance());
        System.out.println("My secondary account has : " + otherAccount.getBalance());

        double amount = 6000;
        System.out.println("Depositing money to the primary bank account : " + amount);
        myAccount.deposit(amount);


        System.out.println("Withdraw more than is in the account");
        myAccount.withdraw(1400);


        System.out.println("Transfer more than 5000 to my account");
        myAccount.deposit(5500);

        System.out.println("Transfer more than is in one account to the other");
        myAccount.transferFrom(otherAccount, amount);
    }


    }
