public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe");
        account1.depositCheckings(2000.50);
        account1.depositSavings(5000.00);
        System.out.println("Your checkings balance: " + account1.getCheckingsBal());
        System.out.println("Your savings balance: " + account1.getSavingsBal());
        System.out.println(account1.numOfAccounts);
        System.out.println("Your account number: " + account1.getAccountNumber());

        System.out.println("--------------------------");
        BankAccount account2 = new BankAccount("Jane Doe");
        account2.depositCheckings(1000.00);
        account2.depositSavings(3000.00);
        account2.withdrawChk(500.00);
        System.out.println("Your checkings balance: " + account2.getCheckingsBal());
        System.out.println("Your savings balance: " + account2.getSavingsBal());
        System.out.println(account2.numOfAccounts);
        System.out.println("Your account number: " + account2.getAccountNumber());
    }
}