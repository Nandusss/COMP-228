/*
 * Nandagopan Dilip
 * Student #: 301166925
 */
public abstract class Account extends Consumer {
    private int accountNum;

    public Account(String id, String name, int accountNum) {
        super(id, name);

        this.accountNum = accountNum;
    }

    //setter
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    //getter
    public int getAccountNum() {
        return accountNum;
    }

    public abstract void withdraw(float amount);
    public abstract void deposit(float amount);

    @Override
    public String toString() {
        return super.toString() + ", accountNum: " + this.accountNum;
    }
}
