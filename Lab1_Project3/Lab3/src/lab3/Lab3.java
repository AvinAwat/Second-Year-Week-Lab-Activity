/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

public class Lab3 {

   
    public static void main(String[] args) {
       
        Account acc = new Account();

        acc.setAccountNumber(12345);
        acc.setBalance(1000.0);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        acc.debit(500);
        acc.debit(700);
    

        
    }
    
}
