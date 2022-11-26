/*
 * Nandagopan Dilip
 * Student #: 301166925
 */

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        System.out.println(bank1);

        bank1.accountList.get(0).withdraw(400);
        bank1.accountList.get(0).withdraw(10);
        bank1.accountList.get(2).withdraw(8274.5F);
        bank1.accountList.get(4).withdraw(46000.00F);
        bank1.accountList.get(4).withdraw(45900);
        bank1.accountList.get(1).deposit(-1);
        bank1.accountList.get(1).deposit(1000);
        bank1.accountList.get(5).deposit(-100);
        bank1.accountList.get(5).deposit(1000);



        System.out.println(bank2);

        bank2.accountList.get(2).withdraw(3000);
        bank2.accountList.get(0).withdraw(10);
        bank2.accountList.get(1).withdraw(44000);
        bank2.accountList.get(3).withdraw(94000.00F);
        bank2.accountList.get(3).withdraw(90000);
        bank2.accountList.get(3).deposit(-1);
        bank2.accountList.get(0).deposit(1000);
        bank2.accountList.get(4).deposit(-5000);
        bank2.accountList.get(4).deposit(5000);

    }
}