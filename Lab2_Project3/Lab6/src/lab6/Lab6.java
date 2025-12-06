/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;


public class Lab6 {

   
    public static void main(String[] args) {
      
        
          Employee e1 = new Employee("Avin", "Awat", 2000.00);
        Employee e2 = new Employee("Awin", "Awat", 5000.00);

      
        System.out.println("NAME\t\t\tYEARLY SALARY");
        System.out.println("-------------------------------");
        System.out.printf("%s %s\t$%.2f%n", e1.getFirstName(), e1.getLastName(), e1.getYearlySalary());
        System.out.printf("%s %s\t$%.2f%n", e2.getFirstName(), e2.getLastName(), e2.getYearlySalary());

        System.out.println("\n10 Percent Salary Raised!! Yoohooooo!");
        System.out.println("NAME\t\t\tYEARLY SALARY");
        System.out.println("-------------------------------");

        e1.raiseSalary(10);
        e2.raiseSalary(10);

        System.out.printf("%s %s\t$%.2f%n", e1.getFirstName(), e1.getLastName(), e1.getYearlySalary());
        System.out.printf("%s %s\t$%.2f%n", e2.getFirstName(), e2.getLastName(), e2.getYearlySalary());
    }

      
    
}
