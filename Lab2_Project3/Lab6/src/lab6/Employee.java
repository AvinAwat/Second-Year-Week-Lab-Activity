/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/*
Activity Three
· Create a class called Employee that includes three instance variables--a first name (type String), a last name (type
String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and
a get method for each instance variable. If the monthly salary is not positive, do not set its value. Write a test application
named EmployeeTest that demonstrates class Employee's capabilities. Create two Employee objects and display each
object's yearly salary. Then give each Employee a 10% raise and display each Employee's yearly salary again.
. The output should be as follows:
NAME
YEARLY SALARY
Yusra Mohammad
Peshang Mohammad
$20000.00
$50000.00
10 Percent Salary Raised!! Yoohooooo!
NAME
YEARLY SALARY
Yusra Mohammad
Peshang Mohammad
$22000.00
01:58:12
$55000.00
*/

public class Employee {
    
    
     private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

   
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }
public double getYearlySalary() {
        return this.monthlySalary * 12;
    }

    
    public void raiseSalary(double percent) {
        if (percent > 0)
            this.monthlySalary += this.monthlySalary * percent / 100;
    }

    
    
    
}
