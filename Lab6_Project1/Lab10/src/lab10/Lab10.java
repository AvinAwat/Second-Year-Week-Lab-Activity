/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

public class Lab10 {

   
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Ali", "Ahmed", 500);
        employees[1] = new HourlyEmployee("Sara", "Hussein", 20, 45);
        employees[2] = new CommissionEmployee("Lana", "Kareem", 10000, 0.05);
        employees[3] = new BasePlusCommissionEmployee("Omar", "Saleh", 8000, 0.05, 400);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.println("Earnings: $" + emp.earnings());
            System.out.println("----------------------------------");
}
}

        
        
    }
    

