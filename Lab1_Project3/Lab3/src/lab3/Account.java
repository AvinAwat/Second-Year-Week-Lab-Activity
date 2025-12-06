/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/*
Activity Three
• Create a class called Account, that includes instance variables accountNumber(type int) and balance (type
double). Provide a set and get method for the instance variables. Provide a method called debit that
withdraws money from an Account. Ensure that the debit amount does not exceed the Account balance. If
it does, the balance should be left unchanged and the method should print a message indicating "Debit
amount exceeded account balance.". Write a test application named AccountTest that demonstrates the
Account class capabilities
• Design the UML Diagram for the application.
*/
public class Account {
    
    
     private int accountNumber;
    private double balance;

    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int num) {
        accountNumber = num;
    }

   
    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    
    public void debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Debit successful. New balance: " + balance);
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }
    
}
