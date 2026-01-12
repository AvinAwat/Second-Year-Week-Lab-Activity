/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;


public class HourlyEmployee extends Employee{
    
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String first, String last, double rate, double hours) {
        super(first, last);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public double earnings() {
        if (hoursWorked <= 40)
            return hourlyRate * hoursWorked;
        else 
            return (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + " | Hourly Employee";
}

}
