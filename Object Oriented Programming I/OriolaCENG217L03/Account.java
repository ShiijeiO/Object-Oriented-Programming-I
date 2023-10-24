import java.util.Date;
/**
 * servers as a blueprint for managing banking account, etc
 *
 * @Clarence
 * @1.2
 */
public class Account
{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;
    
    public Account() {
        dateCreated = new Date();
    }
    
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    //dataCreated accessor
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    
    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
}
