/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;


public class BasePlusCommissionEmployee  extends Employee {
    
     private double baseSalary;
     private double sales;
     private double rate;

    public BasePlusCommissionEmployee(String first, String last, double sales, double rate, double baseSalary) { 
        super(first, last);
        this.sales=sales;
        this.rate=rate;
        this.baseSalary = baseSalary;
        
        
    }

    @Override
    public double earnings() {
        double increasedBase = baseSalary * 1.10; 
        return increasedBase + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + " | Base + Commission Employee (10% Raise)";
}

}
