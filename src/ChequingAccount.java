/*
 * Nandagopan Dilip
 * Student #: 301166925
 */

public class ChequingAccount extends Account {
    private float balance;

    public ChequingAccount(String id, String name, int accountNum) {
        super(id, name, accountNum);

        this.balance = (float) 0.0;
    }

    public ChequingAccount(String id, String name, int accountNum, double balance) {
        super(id, name, accountNum);

        this.balance = (float) balance;
    }

    //setter
    public void setBalance(float balance) {
        this.balance = balance;
    }

    //getter
    public float getBalance() {
        return this.balance;
    }

    //accept the amount and deduct it from balance
    @Override
    public void withdraw(float amount) {
        float balanceCopy = this.balance;

        if(amount > (this.balance + 2000.00)) {
            System.out.println("An amount greater than overdraft of 2000$ cannot be made");
        }
        else if(((balanceCopy + 2000.00) - amount) < 0.00) {
            System.out.println("The balance cannot go below $2000.00 overdraft");
        }
        else {
            this.balance -= amount;
            System.out.println("Successfully withdrew $" + amount +". New Balance is $" + this.balance);
        }
    }

    //accept amount and add it to the balance
    @Override
    public void deposit(float amount) {
        float balanceCopy = this.balance;

        if(amount < 0.0) {
            System.out.println("Amount cannot be less than 0");
        }
        else {
            this.balance += amount;
            System.out.println("Successfully deposited $" + amount +". New Balance is $" + this.balance);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", balance: " + this.balance;
    }
}
