import java.util.Random;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double checkings; // checking balance
    private double savings; // savings balance
    public static int numOfAccounts = 0;
    public static double total = 0;

    // CONSTRUCTOR
    public BankAccount(String name) {
        this.name = name;
        savings = 0;
        checkings = 0;
        generateAccountNumber();
        // Increment account count
        numOfAccounts++;
    }

    // GETTERS
    public double getCheckingsBal() {
        return checkings;
    }

    public double getSavingsBal() {
        return savings;
    }

    public String getAccountNumber() {
        return generateAccountNumber();
    }

    // SETTERS

    private String generateAccountNumber() {
        Random rand = new Random();
        char[] numbers = "1234567890".toCharArray();
        String accountNumber = "";
        while (accountNumber.length() < 10) {
            int index = rand.nextInt(9);
            accountNumber += numbers[index];
        }
        return accountNumber;
    }


    // DEPOSIT
    public void depositCheckings(double amount) {
        checkings += amount;
    }

    public void depositSavings(double amount) {
        savings += amount;
    }

    // WITHDRAW 
    public void withdrawChk(double amount) {
        if(getCheckingsBal() > amount ) {
            checkings -= amount;
        }
        System.out.println("Insufficient funds.");
    }

    public void withdrawSavs(double amount) {
        if(getSavingsBal() > amount ) {
            savings -= amount;
        }
        System.out.println("Insufficient funds.");
    }

    // TOTAL 
    public double getTotal() {
        double total = getCheckingsBal() + getSavingsBal();
        return total;
    }
}
