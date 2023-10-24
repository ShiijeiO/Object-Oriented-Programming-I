
/**
 * test program that implements withdraw and deposit method into account id of 1122
 *
 * @Clarence n01573843
 * @1.1
 */
public class TestAccount extends Account
{
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        
        acc.setAnnualInterestRate(4.5); // set annual intereate rate
        
        acc.withdraw(2500); //using the withdraw method to withdraw $2500
        
        acc.deposit(3000); //using the deposit method to deposit $3000
        
        System.out.println("Balance: $" + acc.getBalance()); //printing the balance
        System.out.println("Monthly Interest: $" + acc.getMonthlyInterestRate() * acc.getBalance() / 100); //printing monthly interest
        System.out.println("Date Created: " + acc.getDateCreated()); //printing the date when the account was created
    }
}
