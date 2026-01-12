/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;


public class CommissionEmployee extends Employee {
    
     private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, double sales, double rate) {
        super(first, last);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + " | Commission Employee";
}

}
