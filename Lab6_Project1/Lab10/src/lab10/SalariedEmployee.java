/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;


public class SalariedEmployee extends Employee{
    
     private double weeklySalary;

    public SalariedEmployee(String first, String last, double salary) {
        super(first, last);
        this.weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + " | Salaried Employee";
    }

    
}
